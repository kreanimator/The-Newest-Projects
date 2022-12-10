using UnityEngine;
using System.Collections;

public class GameOverController : MonoBehaviour {
    public void GameOver()
    {
        Application.LoadLevel("Arena");
    }
}
