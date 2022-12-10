using UnityEngine;
using System.Collections;

public class PositionChanger : MonoBehaviour {
    [Tooltip("Speed at which the transform moves on the x axis")]
    public float XSpeed;
    [Tooltip("Speed at which the transform moves on the y axis")]
    public float YSpeed;
    [Tooltip("Speed at which the transform moves on the z axis")]
    public float ZSpeed;

    // Update is called once per frame
    void FixedUpdate()
    {
        UpdatePosition();
    }

    private void UpdatePosition()
    {
        transform.position = new Vector3(transform.position.x + XSpeed, transform.position.y + YSpeed, transform.position.z + ZSpeed);
    }
}
