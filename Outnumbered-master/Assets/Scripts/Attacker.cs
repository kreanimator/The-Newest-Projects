using UnityEngine;
using System.Collections;

public class Attacker : MonoBehaviour {
    [Tooltip("Target which the enity will attempt to attack")]
    public GameObject Target;
    [Tooltip("Range at which this entity can attack")]
    public float Range = 1.0f;
    
    public void AttackTarget()
    {
        if (Target.GetComponent<Death>() == null)
        {
            Target.AddComponent<Death>();
        }
    }
}
