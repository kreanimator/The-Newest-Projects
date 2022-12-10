using UnityEngine;
using UnityEngine.UI;
using System.Collections;

public class ScoreboardController : MonoBehaviour
{
    private Text scoreText;
    private Text playerLivesText;
    private Text ghostLivesText;

    // Use this for initialization
    void Start()
    {
        scoreText = transform.Find("Score").GetComponent<Text>();
        playerLivesText = transform.Find("Player Lives").GetComponent<Text>();
        ghostLivesText = transform.Find("Ghost Lives").GetComponent<Text>();
    }

    // Update is called once per frame
    void Update()
    {
        GameManager.Instance.Score += Time.deltaTime * (GameManager.Instance.GhostLives + 1);
        scoreText.text = "Score: " + (int) GameManager.Instance.Score;
        playerLivesText.text = "x " + GameManager.Instance.PlayerLives;
        ghostLivesText.text = "x " + GameManager.Instance.GhostLives;
    }
}
