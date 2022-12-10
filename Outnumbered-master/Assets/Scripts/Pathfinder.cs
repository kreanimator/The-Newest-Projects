using UnityEngine;
using System.Collections;

public class Pathfinder : MonoBehaviour
{
    [Tooltip("Number of seconds before entity updates path")]
    public float PathUpdateTime = 1.0f;
    [Tooltip("Whether or not the entity is stuck")]
    public bool IsStuck = false;

    private GameObject target;
    public GameObject Target
    {
        get { return target; }
        set
        {
            target = value;
            Agent.SetDestination(target.transform.position);
        }
    }

    private PolyNavAgent agent;
    public PolyNavAgent Agent
    {
        get
        {
            if (!agent)
                agent = GetComponent<PolyNavAgent>();
            return agent;
        }
    }

    private Vector2 previousPosition;

    void Start()
    {
        previousPosition = transform.position;
        InvokeRepeating("UpdatePath", PathUpdateTime, PathUpdateTime);
        InvokeRepeating("CheckIfStuck", 1.0f, 1.0f);
    }

    public bool IsPathBlocked()
    {
        return IsStuck || !Agent.hasPath;
    }

    private void CheckIfStuck()
    {
        float distanceTraveled = Vector2.Distance(previousPosition, transform.position);
        previousPosition = transform.position;
        IsStuck = distanceTraveled < 0.1f;
    }

    private void UpdatePath()
    {
        if (Target != null && Agent.activePath.Count <= 1)
        {
            Agent.SetDestination(Target.transform.position);
        }
    }
}
