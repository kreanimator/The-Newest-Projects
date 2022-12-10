using UnityEngine;
using System.Collections;

public class OnCameraKeeper2D : MonoBehaviour
{
    [Tooltip("The camera of which the game object must remain in view.  If left blank, the Main Camera will be used.")]
    public Camera Camera;
    [Tooltip("This is how far off screen to allow the game object")]
    public Vector2 OffScreenOffset;

    // Use this for initialization
    void Start()
    {
        if (!Camera)
        {
            Camera = Camera.main;
        }
    }

    // Update is called once per frame
    void Update()
    {
        KeepOnScreen();
    }

    private void KeepOnScreen()
    {
        Rect viewportRectangle = Camera.GetViewport();
        float xExtent = 0;
        float yExtent = 0;
        if (gameObject.renderer)
        {
            xExtent = gameObject.renderer.bounds.extents.x;
            yExtent = gameObject.renderer.bounds.extents.y;
        }
        float minX = viewportRectangle.xMin + xExtent - OffScreenOffset.x;
        float maxX = viewportRectangle.xMax - xExtent + OffScreenOffset.x;
        float minY = viewportRectangle.yMin + yExtent - OffScreenOffset.y;
        float maxY = viewportRectangle.yMax - yExtent + OffScreenOffset.y;
        transform.position = new Vector3(
    Mathf.Clamp(transform.position.x, minX, maxX),
    Mathf.Clamp(transform.position.y, minY, maxY),
    transform.position.z);
    }
}
