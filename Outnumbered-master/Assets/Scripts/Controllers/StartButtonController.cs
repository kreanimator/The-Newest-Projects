using UnityEngine;
using System.Collections;

public class StartButtonController : MonoBehaviour {

    void Start () {
        Time.timeScale = 0;
    }

    public void BeginTheOnslaught()
    {
        GameManager.Instance.gameObject.AddComponent<LevelLoader>();
        Destroy(gameObject);
    }
}
