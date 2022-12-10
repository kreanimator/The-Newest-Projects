using UnityEngine;
using System.Collections;

public static class RigidBody2DExtensions
{
    /// <summary>
    /// Sets the velocity for the game object and all of its descendants.
    /// If a descendant does not have a Rigidbody2D, neither it nor any of its descendants will have their velocity changed.
    /// </summary>
    public static void SetVelocityForDescendants(this Rigidbody2D rigidbody2D, Vector2 velocity)
    {
        rigidbody2D.velocity = velocity;
        foreach (Transform child in rigidbody2D.transform)
        {
            if (child.rigidbody2D)
            {
                child.rigidbody2D.SetVelocityForDescendants(velocity);
            }
        }
    }

    /// <summary>
    /// This ends any active calls of Rigidbody2D.MovePositionInLine() or Rigidbody2D.movePositionInCircle()
    /// </summary>
    public static void CancelMovePosition(this Rigidbody2D rigidbody2D)
    {
        RemoveExistingMovePositionComponents(rigidbody2D);
    }

    /// <summary>
    /// Moves the RigidBody2D's gameobject in a straight line, for a specified duration, for a specified distance, and in a specified direction.
    /// Optionally, whether or not the Rigidbody2D should rotate towards the direction it is moving, whether or not to invert horizontal movement, and whether or not to invert vertical movement can be declared.
    /// If the distance is set to 0, the object will move in line until Rigidbody2D.CancelMovePosition(), Rigidbody2D.MovePositionInLine(), or Rigidbody2D.MovePositionInCircle() is called, and the Seconds will be the speed at pixels per second.
    /// When Rigidbody2D.MovePositionInCircle() is called, any pending calls of Rigidbody2D.MovePositionInCircle() or Rigidbody2D.MovePositionInLine() for that GameObject will be canceled.
    /// Rigidbody2D.MovePosition() will be unavailable until this call completes.
    /// </summary>
    public static void MovePositionInLine(this Rigidbody2D rigidbody2D, float seconds, float distance, Vector2 direction, bool rotate = true, bool invertHorizontalMovement = false, bool invertVerticalMovement = false)
    {
        RemoveExistingMovePositionComponents(rigidbody2D);

        MovePositionInLine movePositionInLine = rigidbody2D.gameObject.AddComponent<MovePositionInLine>();
        movePositionInLine.hideFlags = HideFlags.HideInInspector;
        movePositionInLine.Seconds = seconds;
        movePositionInLine.Distance = distance;
        movePositionInLine.Direction = direction;
        movePositionInLine.Rotate = rotate;
        movePositionInLine.InvertHorizontalMovement = invertHorizontalMovement;
        movePositionInLine.InvertVerticalMovement = invertVerticalMovement;
    }

    /// <summary>
    /// Moves the RigidBody2D's gameObject in a circle for a specified duration, with a specified radius, and starting in a specified direction.
    /// Optionally, the number of circles, whether or not the circle should be clockwise, whether or not the Rigidbody2D should rotate while moving, whether or not to invert horizontal movement, and whether or not to invert vertical movement can be declared.
    /// If the number of circles is set to 0, the object will move in circles until Rigidbody2D.CancelMovePosition(), Rigidbody2D.MovePositionInEllipse(), Rigidbody2D.MovePositionInLine(), or Rigidbody2D.MovePositionInCircle() is called, and the seconds will become the time it takes to complete a single circle.
    /// When Rigidbody2D.MovePositionInCircle() is called, any pending calls of Rigidbody2D.MovePositionInCircle(), Rigidbody2D.MovePositionInEllipse(), or Rigidbody2D.MovePositionInLine() for that GameObject will be canceled.
    /// Rigidbody2D.MovePosition() will be unavailable until this call completes.
    /// </summary>
    public static void MovePositionInCircle(this Rigidbody2D rigidbody2D, float seconds, float numberOfCircles, float radius, Vector2 startDirection, bool clockwise = true, bool rotate = true, bool invertHorizontalMovement = false, bool invertVerticalMovement = false)
    {
        rigidbody2D.MovePositionInEllipse(seconds, numberOfCircles, radius, startDirection, new Vector2(1.0F, 1.0F), clockwise, rotate, invertHorizontalMovement, invertVerticalMovement);
    }

    /// <summary>
    /// Moves the RigidBody2D's gameObject in an ellipse for a specified duration, with a specified radius, starting in a specified direction, and shaped by the specified x and y modifier.
    /// Optionally, the number of ellipses, whether or not the ellipse should be clockwise, whether or not the Rigidbody2D should rotate while moving, whether or not to invert horizontal movement, and whether or not to invert vertical movement can be declared.
    /// If the number of ellipses is set to 0, the object will move in ellipses until Rigidbody2D.CancelMovePosition(), Rigidbody2D.MovePositionInLine(), Rigidbody2D.MovePositionInEllipse(), or Rigidbody2D.MovePositionInCircle() is called, and the seconds will become the time it takes to complete a single ellipse.
    /// When Rigidbody2D.MovePositionInEllipse() is called, any pending calls of Rigidbody2D.MovePositionInCircle(), Rigidbody2D.MovePositionInEllipse(), or Rigidbody2D.MovePositionInLine() for that GameObject will be canceled.
    /// Rigidbody2D.MovePosition() will be unavailable until this call completes.
    /// </summary>
    public static void MovePositionInEllipse(this Rigidbody2D rigidbody2D, float seconds, float numberOfCircles, float radius, Vector2 startDirection, Vector2 ellipticalMultiplier, bool clockwise = true, bool rotate = true, bool invertHorizontalMovement = false, bool invertVerticalMovement = false)
    {
        RemoveExistingMovePositionComponents(rigidbody2D);

        MovePositionInEllipse movePositionInEllipse = rigidbody2D.gameObject.AddComponent<MovePositionInEllipse>();
        movePositionInEllipse.hideFlags = HideFlags.HideInInspector;
        movePositionInEllipse.Seconds = seconds;
        movePositionInEllipse.NumberOfCircles = numberOfCircles;
        movePositionInEllipse.Radius = radius;
        movePositionInEllipse.StartDirection = startDirection;
        movePositionInEllipse.EllipticalMultiplier = ellipticalMultiplier;
        movePositionInEllipse.Clockwise = clockwise;
        movePositionInEllipse.Rotate = rotate;
        movePositionInEllipse.InvertHorizontalMovement = invertHorizontalMovement;
        movePositionInEllipse.InvertVerticalMovement = invertVerticalMovement;
    }

    private static void RemoveExistingMovePositionComponents(Rigidbody2D rigidbody2D)
    {
        MovePositionInLine[] movePositionInLineComponents = rigidbody2D.gameObject.GetComponents<MovePositionInLine>();
        foreach (MovePositionInLine movePositionInLineComponent in movePositionInLineComponents)
        {
            GameObject.Destroy(movePositionInLineComponent);
        }

        MovePositionInEllipse[] movePositionInEllipseComponents = rigidbody2D.gameObject.GetComponents<MovePositionInEllipse>();
        foreach (MovePositionInEllipse movePositionInEllipseComponent in movePositionInEllipseComponents)
        {
            GameObject.Destroy(movePositionInEllipseComponent);
        }
    }
}

[RequireComponent(typeof(Rigidbody2D))]
class MovePositionInLine : MonoBehaviour
{
    public float Seconds { get; set; }
    public float Distance { get; set; }
    public Vector2 Direction { get; set; }
    public bool Rotate { get; set; }
    public bool InvertHorizontalMovement { get; set; }
    public bool InvertVerticalMovement { get; set; }

    private float distanceTraveled;
    private bool moveInfinitely;

    void Start()
    {
        float xDirection = InvertHorizontalMovement ? -Direction.x : Direction.x;
        float yDirection = InvertVerticalMovement ? -Direction.y : Direction.y;
        Direction = new Vector2(xDirection, yDirection);
        Direction = Direction.normalized;

        if (Distance == 0)
        {
            moveInfinitely = true;
        }
    }

    void FixedUpdate()
    {
        if (Rotate)
        {
            float rotationAngle = Mathf.Atan2(Direction.y, Direction.x) * Mathf.Rad2Deg - 90.0F;
            Quaternion quaternion = Quaternion.AngleAxis(rotationAngle, Vector3.forward);
            transform.rotation = Quaternion.RotateTowards(transform.rotation, quaternion, Time.deltaTime * 360);
        }

        float speed = Seconds != 0 ? Distance / Seconds * Time.deltaTime : 0;
        if (Distance == 0)
        {
            speed = Seconds * Time.deltaTime;
        }
        Vector2 oldPosition = rigidbody2D.transform.position;
        Vector2 newPosition = oldPosition + Direction * speed;
        rigidbody2D.MovePosition(newPosition);

        distanceTraveled += Vector2.Distance(oldPosition, newPosition);
    }

    void Update()
    {
        bool movementComplete = distanceTraveled >= Distance && !moveInfinitely;
        if (movementComplete)
        {
            Destroy(this);
        }
    }
}

[RequireComponent(typeof(Rigidbody2D))]
class MovePositionInEllipse : MonoBehaviour
{
    public float Seconds { get; set; }
    public float NumberOfCircles { get; set; }
    public float Radius { get; set; }
    public Vector2 StartDirection { get; set; }
    public Vector2 EllipticalMultiplier { get; set; }
    public bool Clockwise { get; set; }
    public bool Rotate { get; set; }
    public bool InvertHorizontalMovement { get; set; }
    public bool InvertVerticalMovement { get; set; }

    private float angle = 0;
    private float xOffset;
    private float yOffset;
    private float startAngle;
    private bool moveInfinitely;

    void Start()
    {
        float xDirection = InvertHorizontalMovement ? -StartDirection.x : StartDirection.x;
        float yDirection = InvertVerticalMovement ? -StartDirection.y : StartDirection.y;
        StartDirection = new Vector2(xDirection, yDirection);
        Clockwise = !Clockwise;

        StartDirection = StartDirection.normalized;
        EllipticalMultiplier = EllipticalMultiplier.normalized;
        angle = StartDirection.ToRadians();
        if (Clockwise)
        {
            xOffset = StartDirection.y * Radius * EllipticalMultiplier.x + rigidbody2D.transform.position.x;
            yOffset = -(StartDirection.x * Radius * EllipticalMultiplier.y) + rigidbody2D.transform.position.y;
        }
        else
        {
            xOffset = -(StartDirection.y * Radius * EllipticalMultiplier.x) + rigidbody2D.transform.position.x;
            yOffset = StartDirection.x * Radius * EllipticalMultiplier.y + rigidbody2D.transform.position.y;
            angle += Mathf.PI;
        }
        startAngle = angle;

        if (NumberOfCircles == 0)
        {
            NumberOfCircles = 1;
            moveInfinitely = true;
        }
    }

    void FixedUpdate()
    {
        if (Clockwise)
        {
            if (NumberOfCircles != 0)
            {
                angle -= Seconds != 0 ? 2 * Mathf.PI / Seconds * NumberOfCircles * Time.deltaTime : 0;
            }
            else
            {
                angle -= Seconds * Time.deltaTime;
            }
        }
        else
        {
            if (NumberOfCircles != 0)
            {
                angle += Seconds != 0 ? 2 * Mathf.PI / Seconds * NumberOfCircles * Time.deltaTime : 0;
            }
            else
            {
                angle += Seconds * Time.deltaTime;
            }
        }
        Vector3 oldPosition = rigidbody2D.transform.position;
        float newX = Mathf.Cos(angle) * Radius * EllipticalMultiplier.x + xOffset;
        float newY = Mathf.Sin(angle) * Radius * EllipticalMultiplier.y + yOffset;
        Vector3 newPosition = new Vector2(newX, newY);

        if (Rotate)
        {
            Vector3 direction = oldPosition - newPosition;
            float rotationAngle = Mathf.Atan2(direction.y, direction.x) * Mathf.Rad2Deg + 90.0F;
            Quaternion quaternion = Quaternion.AngleAxis(rotationAngle, Vector3.forward);
            transform.rotation = Quaternion.RotateTowards(transform.rotation, quaternion, Time.deltaTime * 360);
        }
        rigidbody2D.MovePosition(newPosition);
    }

    void Update()
    {
        bool movementComplete = Mathf.Abs(angle - startAngle) >= NumberOfCircles * 2 * Mathf.PI && !moveInfinitely;
        if (movementComplete)
        {
            Destroy(this);
        }
    }
}