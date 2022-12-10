using UnityEngine;
using UnityEngine.UI;
using System.Collections;

public class GameManager : MonoBehaviour
{
    [Tooltip("The number of player lives remaining")]
    public int PlayerLives;
    [Tooltip("Score that the player has accumulated")]
    public float Score;

    public int GhostLives { get; set; }

    private static GameManager instance;
    public static GameManager Instance
    {
        get
        {
            if (instance == null)
            {
                instance = GameObject.FindObjectOfType<GameManager>();
            }
            return instance;
        }
    }
    private int currentFrame;
    public int CurrentFrame
    {
        get { return currentFrame; }
    }

    void Update()
    {
        if (PlayerLives == 0)
        {
            GameOver();
        }
    }

    void LateUpdate()
    {
        currentFrame++;
    }

    /// <summary>
    /// Sets the Current Frame to 0.
    /// </summary>
    public void ResetCurrentFrame()
    {
        currentFrame = 0;
    }

    private void GameOver()
    {
        Time.timeScale = 0;
        GameObject gameOver = GameObject.Find("Game Over");
        gameOver.GetComponent<Image>().enabled = true;
        Text gameOverText = GameObject.Find("Game Over Text").GetComponent<Text>();
        gameOverText.enabled = true;
    }
}
