using UnityEngine;
using UnityEngine.UI;
using System.Collections;

public class LevelLoader : MonoBehaviour
{
    // Use this for initialization
    void Start()
    {
        Time.timeScale = 0.01f;
        ResetLevel();
        LoadPlayer();
        LoadGhosts();
        RemoveDeathScripts();
        StartCoroutine("CountDown");
    }

    private void ResetLevel()
    {
        foreach (GameObject enemy in GameObject.FindGameObjectsWithTag("Enemy"))
        {
            Destroy(enemy.gameObject);
        }
        foreach (GameObject structure in GameObject.FindGameObjectsWithTag("Structure"))
        {
            Destroy(structure.gameObject);
        }
        foreach (GameObject enemySpawner in GameObject.FindGameObjectsWithTag("Enemy Spawner"))
        {
            enemySpawner.GetComponent<EnemySpawner>().ResetSpawner();
        }
    }

    private void LoadPlayer()
    {
        GameObject player = Instantiate(Resources.Load("Player"), Vector3.zero, Quaternion.identity) as GameObject;
        Camera.main.GetComponent<TargetFollower>().Target = player.transform;
    }

    private void LoadGhosts()
    {
        GameManager.Instance.GhostLives = 0;
        foreach (Transform ghost in GameObject.Find("Ghosts").transform)
        {
            ghost.gameObject.GetComponent<Turret>().enabled = false;
            ghost.gameObject.SetActive(true);
            ghost.transform.position = Vector3.zero;
            GameManager.Instance.GhostLives++;
        }
    }

    private void RemoveDeathScripts()
    {
        foreach (Death deathScript in GameObject.FindObjectsOfType<Death>())
        {
            Destroy(deathScript);
        }
    }

    IEnumerator CountDown()
    {
        GameObject countdown = GameObject.Find("Countdown");
        countdown.GetComponent<Image>().enabled = true;
        Text countdownText = GameObject.Find("Countdown Text").GetComponent<Text>();
        countdownText.enabled = true;
        countdownText.text = "3";
        yield return new WaitForSeconds(0.01f);
        countdownText.text = "2";
        yield return new WaitForSeconds(0.01f);
        countdownText.text = "1";
        yield return new WaitForSeconds(0.01f);
        countdown.GetComponent<Image>().enabled = false;
        countdownText.enabled = false;
        Time.timeScale = 1.0f;
        Destroy(this);
    }
}
