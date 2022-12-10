using UnityEngine;
using System.Collections;

public static class SpriteRendererExtensions
{
    /// <summary>
    /// Changes the color of the SpriteRenderer to the given Color over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeColorOverTime(this SpriteRenderer spriteRenderer, Color color, float seconds)
    {

        ColorChanger colorChanger = spriteRenderer.gameObject.AddComponent<ColorChanger>();
        colorChanger.hideFlags = HideFlags.HideInInspector;
        colorChanger.TargetColor = color;
        colorChanger.Seconds = seconds;
    }

    /// <summary>
    /// Changes the color of the SpriteRenderer to the given the red [0, 1], green [0, 1], blue [0, 1], and alpha [0, 1] over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeColorOverTime(this SpriteRenderer spriteRenderer, float red, float green, float blue, float alpha, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(red, green, blue, alpha), seconds);
    }

    /// <summary>
    /// Changes the color of the SpriteRenderer to the given the red [0, 1], green [0, 1], and blue [0, 1] over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeColorOverTime(this SpriteRenderer spriteRenderer, float red, float green, float blue, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(red, green, blue, spriteRenderer.color.a), seconds);
    }

    /// <summary>
    /// Changes the color of the SpriteRenderer to the given the red [0, 255], green [0, 255], blue [0, 255], and alpha [0, 255] over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeColorOverTime(this SpriteRenderer spriteRenderer, int red, int green, int blue, int alpha, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(red / 255.0f, green / 255.0f, blue / 255.0f, alpha / 255.0f), seconds);
    }

    /// <summary>
    /// Changes the color of the SpriteRenderer to the given the red [0, 255], green [0, 255], and blue [0, 255], and over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeColorOverTime(this SpriteRenderer spriteRenderer, int red, int green, int blue, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(red / 255.0f, green / 255.0f, blue / 255.0f, spriteRenderer.color.a), seconds);
    }

    /// <summary>
    /// Changes the alpha of the SpriteRenderer to the given alpha [0, 1] over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeAlphaOverTime(this SpriteRenderer spriteRenderer, float alpha, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(spriteRenderer.color.r, spriteRenderer.color.g, spriteRenderer.color.b, alpha), seconds);
    }

    /// <summary>
    /// Changes the alpha of the SpriteRenderer to the given alpha [0, 255] over the given number of seconds (0, infinity).
    /// </summary>
    public static void ChangeAlphaOverTime(this SpriteRenderer spriteRenderer, int alpha, float seconds)
    {
        spriteRenderer.ChangeColorOverTime(new Color(spriteRenderer.color.r, spriteRenderer.color.g, spriteRenderer.color.b, alpha / 255.0f), seconds);
    }

    [RequireComponent(typeof(SpriteRenderer))]
    class ColorChanger : MonoBehaviour
    {
        public Color TargetColor { get; set; }
        public float Seconds { get; set; }

        private SpriteRenderer spriteRenderer;
        private float changeInRed;
        private float changeInGreen;
        private float changeInBlue;
        private float changeInAlpha;
        private float secondsRemaining;

        void Start()
        {
            spriteRenderer = gameObject.GetComponent<SpriteRenderer>();
            changeInRed = TargetColor.r - spriteRenderer.color.r;
            changeInGreen = TargetColor.g - spriteRenderer.color.g;
            changeInBlue = TargetColor.b - spriteRenderer.color.b;
            changeInAlpha = TargetColor.a - spriteRenderer.color.a;
            secondsRemaining = Seconds;
        }

        void Update()
        {
            if (secondsRemaining > 0)
            {
                float elapsedTime = Time.deltaTime / Seconds;
                Color oldColor = spriteRenderer.color;
                float updatedRed = oldColor.r + changeInRed * elapsedTime;
                float updatedGreen = oldColor.g + changeInGreen * elapsedTime;
                float updatedBlue = oldColor.b + changeInBlue * elapsedTime;
                float updatedAlpha = oldColor.a + changeInAlpha * elapsedTime;
                secondsRemaining -= elapsedTime;
                spriteRenderer.color = new Color(updatedRed, updatedGreen, updatedBlue, updatedAlpha);
            }
            else
            {
                spriteRenderer.color = TargetColor;
                Destroy(this);
            }
        }
    }
}