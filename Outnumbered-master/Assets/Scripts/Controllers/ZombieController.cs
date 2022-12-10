using UnityEngine;
using System.Collections;

[RequireComponent(typeof(Pathfinder))]
[RequireComponent(typeof(Attacker))]
public class ZombieController : MonoBehaviour
{
    private Pathfinder pathfinder;
    private Attacker attacker;
    private AudioSource audioSource;

    void Start()
    {
        pathfinder = GetComponent<Pathfinder>();
        attacker = GetComponent<Attacker>();
        SetUpAudio();
        InvokeRepeating("FindNewTarget", 1.0f, Random.Range(1.0f, 10.0f));
    }

    void Update()
    {
        if (pathfinder.Target == null || pathfinder.IsPathBlocked() || attacker.Target == null)
        {
            FindNewTarget();
        }
        if (attacker.Target != null && Vector2.Distance(attacker.Target.transform.position, transform.position) <= attacker.Range)
        {
            attacker.AttackTarget();
        }
    }

    private void SetUpAudio()
    {
        InvokeRepeating("PlayZombieSound", Random.Range(0, 10.0f), Random.Range(10.0f, 25.0f));
        audioSource = gameObject.AddComponent<AudioSource>();
        audioSource.clip = Resources.Load("Audio/zombie" + Random.Range(1, 24)) as AudioClip;
    }

    private void PlayZombieSound()
    {
        audioSource.Play();
    }

    private void FindNewTarget()
    {
        GameObject target = GameObject.FindGameObjectWithTag("Player");
        if (target == null)
        {
            return;
        }
        pathfinder.Target = target;
        float targetDistance = pathfinder.Agent.remainingDistance;
        Debug.Log(targetDistance);
        foreach (GameObject ghost in GameObject.FindGameObjectsWithTag("Ghost"))
        {
            pathfinder.Target = ghost;
            if (pathfinder.Agent.remainingDistance < targetDistance)
            {
                target = ghost;
                targetDistance = pathfinder.Agent.remainingDistance;
            }
        }
        if (pathfinder.IsPathBlocked())
        {
            targetDistance = Mathf.Infinity;
            foreach (GameObject structure in GameObject.FindGameObjectsWithTag("Structure"))
            {
                if (Vector2.Distance(structure.transform.position, transform.position) > attacker.Range)
                {
                    continue;
                }
                pathfinder.Agent.SetDestination(structure.transform.position);
                float structureDistance = pathfinder.Agent.remainingDistance;
                if (structureDistance < targetDistance)
                {
                    target = structure;
                    targetDistance = structureDistance;
                }
            }
            PolyNavObstacle polyNavObstacle = target.gameObject.GetComponent<PolyNavObstacle>();
            if (polyNavObstacle != null)
            {
                polyNavObstacle.enabled = false;
            }
        }
        pathfinder.Target = target;
        attacker.Target = target;
    }
}
