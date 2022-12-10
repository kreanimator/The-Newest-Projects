using UnityEngine;
using System.Collections;

[RequireComponent(typeof(Shooter))]
public class Turret : MonoBehaviour
{
    private Shooter shooter;
    private GameObject target;

    void Start()
    {
        shooter = GetComponent<Shooter>();
    }

    // Update is called once per frame
    void Update()
    {
        if (target == null)
        {
            FindNewTarget();
        }
        else
        {
            Aim();
            shooter.Shoot();
        }
    }

    private void FindNewTarget()
    {
        float closestDistance = Mathf.Infinity;
        foreach (GameObject enemy in GameObject.FindGameObjectsWithTag("Enemy"))
        {
            float distanceToTarget = Vector2.Distance(transform.position, enemy.transform.position);
            if (distanceToTarget < closestDistance)
            {
                closestDistance = distanceToTarget;
                target = enemy;
            }
        }
    }

    private void Aim()
    {
        if (target != null)
        {
            shooter.Direction = target.transform.position - transform.position;
        }
    }
}
