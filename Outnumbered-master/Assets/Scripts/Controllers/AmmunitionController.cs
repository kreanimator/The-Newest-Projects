using UnityEngine;
using System.Collections;

public class AmmunitionController : MonoBehaviour
{
    public GameObject Creator { get; set; }

    void OnTriggerEnter2D(Collider2D collider)
    {
        if (collider.gameObject == Creator)
        {
            return;
        }
        switch (collider.tag)
        {
            case "Structure":
                Destroy(gameObject);
                break;
            case "Enemy":
                collider.gameObject.AddComponent<Death>();
                Destroy(gameObject);
                break;
            case "Trees":
                Destroy(gameObject);
                break;
        }
    }
}
