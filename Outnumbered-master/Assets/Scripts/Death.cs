using UnityEngine;
using System.Collections;

public class Death : MonoBehaviour
{
    void Start()
    {
        switch (tag)
        {
            case "Player":
                LoadAndPlaySound("player_dies");
                GetComponent<Mobility>().Moveable = false;
                GetComponent<Animator>().SetTrigger("Die");
                                Destroy(gameObject, 3.0f);
                break;
            case "Ghost":
                LoadAndPlaySound("ghost_dies");
                gameObject.SetActive(false);
                GameObject zombie = Instantiate(Resources.Load("Zombie 3"), transform.position, transform.rotation) as GameObject;
                zombie.transform.parent = GameObject.Find("Enemies").transform;
                GameManager.Instance.GhostLives--;
                break;
            case "Structure":
                LoadAndPlaySound("building");
                GetComponent<Animator>().SetTrigger("Destroying");
                Destroy(gameObject, 1.0f);
                break;
            case "Enemy":
                Destroy(gameObject);
                break;
        }
    }

    private void LoadAndPlaySound(string fileName)
    {
     AudioSource audioSource = gameObject.AddComponent<AudioSource>();
        audioSource.clip = Resources.Load("Audio/" + fileName) as AudioClip;
        audioSource.Play();
    }
}
