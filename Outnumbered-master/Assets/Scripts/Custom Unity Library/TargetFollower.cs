using UnityEngine;
using System.Collections;

public class TargetFollower : MonoBehaviour
{

    [Tooltip("Target to be followed")]
    public Transform Target;
    [Tooltip("Mimic the Target's changes in x coordinate")]
    public bool FollowTargetX = true;
    [Tooltip("Mimic the Target's changes in y coordinate")]
    public bool FollowTargetY = true;
    [Tooltip("Mimic the Target's changes in z coordinate")]
    public bool FollowTargetZ = true;

    // Update is called once per frame
    void FixedUpdate()
    {
        if (Target)
        {
            Vector3 targetMovement = GetTargetMovement();
            UpdatePosition(targetMovement);
        }
    }

    /// <summary>
    /// Change the target which is to be followed.
    /// </summary>
    public void ChangeTarget(Transform target)
    {
        this.Target = target;
    }

    private Vector3 oldTargetPosition;
    private Vector3 GetTargetMovement()
    {
        if (oldTargetPosition == Vector3.zero)
        {
            oldTargetPosition = Target.transform.position;
        }
        Vector3 newTargetPosition = Target.transform.position;
        Vector3 targetMovement = newTargetPosition - oldTargetPosition;
        oldTargetPosition = new Vector3(newTargetPosition.x, newTargetPosition.y, newTargetPosition.z);
        return targetMovement;
    }

    private void UpdatePosition(Vector3 targetMovement)
    {
        float xPosition = transform.position.x;
        float yPosition = transform.position.y;
        float zPosition = transform.position.z;
        if (FollowTargetX)
        {
            xPosition += targetMovement.x;
        }
        if (FollowTargetY)
        {
            yPosition += targetMovement.y;
        }
        if (FollowTargetZ)
        {
            zPosition += targetMovement.z;
        }
        Vector3 updatedPosition = new Vector3(xPosition, yPosition, zPosition);
        transform.position = updatedPosition;
    }
}
