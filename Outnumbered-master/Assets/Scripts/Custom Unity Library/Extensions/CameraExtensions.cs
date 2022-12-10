using UnityEngine;
using System.Collections;

public static class CameraExtensions
{
    /// <summary>
    /// Returns the viewport of the camera as a Rect.  This method is intended for Orthographic cameras.
    /// </summary>
    /// <param name="camera"></param>
    /// <returns></returns>
    public static Rect GetViewport(this Camera camera)
    {
        Vector3 bottomLeftPoint = camera.ScreenToWorldPoint(Vector3.zero);
        Vector3 topRightPoint = camera.ScreenToWorldPoint(new Vector3(
            camera.pixelWidth, camera.pixelHeight));
        Rect viewportRectangle = new Rect(
            bottomLeftPoint.x,
            bottomLeftPoint.y,
            topRightPoint.x - bottomLeftPoint.x,
            topRightPoint.y - bottomLeftPoint.y);
        return viewportRectangle;
    }
}
