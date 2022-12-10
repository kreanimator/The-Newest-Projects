using UnityEngine;
using System.Collections;

public class DestroyedOnLeavingCamera : MonoBehaviour {
    void OnBecameInvisible()
    {
        Destroy(gameObject);
    }
}
