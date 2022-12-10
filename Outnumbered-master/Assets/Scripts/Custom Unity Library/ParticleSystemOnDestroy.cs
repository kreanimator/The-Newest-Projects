using UnityEngine;
using System.Collections;

public class ParticleSystemOnDestroy : MonoBehaviour
{
    [Tooltip("The particle system which will be trigged when game object is destroyed")]
    public ParticleSystem ParticleSystem;

    private bool applicationClosing;
    void OnApplicationQuit()
    {
        applicationClosing = true;
    }

    void OnDestroy()
    {
        if (applicationClosing)
        {
            return;
        }

        if (renderer.IsVisible(Camera.main))
        {
            GameObject explosions = GameObject.Find("Explosions");
            if (!explosions)
            {
                explosions = new GameObject("Explosions");
            }

            ParticleSystem particleSystem = GameObject.Instantiate(ParticleSystem, transform.position, Quaternion.identity) as ParticleSystem;
            particleSystem.transform.parent = explosions.transform;
            particleSystem.Play();
            Destroy(particleSystem.gameObject, particleSystem.duration);
        }
    }
}
