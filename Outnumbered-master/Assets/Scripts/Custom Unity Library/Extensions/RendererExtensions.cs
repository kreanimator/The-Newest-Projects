using UnityEngine;
using System.Collections;

public static class RendererExtensions
{
    /// <summary>
    /// Returns true if the renderer is visible by the given camera.
    /// </summary>
    public static bool IsVisible(this Renderer renderer, Camera camera)
    {
        Rect viewport = camera.GetViewport();
        bool viewportContainsRenderer = viewport.Contains(renderer.bounds.min) || viewport.Contains(renderer.bounds.max);
        return viewportContainsRenderer;
    }
}