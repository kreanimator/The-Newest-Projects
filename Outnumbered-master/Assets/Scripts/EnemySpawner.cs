using UnityEngine;
using System.Collections;

public class EnemySpawner : MonoBehaviour
{
    [Tooltip("Enemy which will be spawned")]
    public GameObject Enemy;
    [Tooltip("Delay until enemy spawning begins in seconds")]
    public float SpawnDelay = 0.0F;
    [Tooltip("Rate at which enemies spawn in seconds")]
    public float SpawnRate = 1.0F;

    void Start()
    {
        ResetSpawner();
    }

    /// <summary>
    /// Resets spawn timer to beginning
    /// </summary>
    public void ResetSpawner()
    {
        CancelInvoke();
        InvokeRepeating("SpawnEnemy", SpawnDelay, SpawnRate);
    }

    private void SpawnEnemy()
    {
        GameObject enemy = Instantiate(Enemy, transform.position, Quaternion.identity) as GameObject;
        enemy.transform.parent = GameObject.Find("Enemies").transform;
    }
}
