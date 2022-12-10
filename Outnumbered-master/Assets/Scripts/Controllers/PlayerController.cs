using UnityEngine;
using System.Collections;
using System.Collections.Generic;

[RequireComponent(typeof(Animator))]
[RequireComponent(typeof(Rigidbody2D))]
[RequireComponent(typeof(Mobility))]
[RequireComponent(typeof(Builder))]
[RequireComponent(typeof(Shooter))]
public class PlayerController : MonoBehaviour
{
    private Animator animator;
    private Mobility mobility;
    private Builder builder;
    private Shooter shooter;
    private FrameState currentFrameState;
    private List<FrameState> frameStates = new List<FrameState>();
    private bool isApplicationQuitting = false;

    void Start()
    {
        animator = GetComponent<Animator>();
        mobility = GetComponent<Mobility>();
        builder = GetComponent<Builder>();
        shooter = GetComponent<Shooter>();
    }
    // Update is called once per frame
    void Update()
    {
        currentFrameState = new FrameState();
        mobility.Move(Input.GetAxis("Horizontal"), Input.GetAxis("Vertical"));
        animator.SetFloat("Movement Speed", rigidbody2D.velocity.sqrMagnitude);
        if (Input.GetButton("Build Barricade"))
        {
            builder.Build("Barricade");
            animator.SetTrigger("Building");
            currentFrameState.BuildBarricade = true;
        }
        if (Input.GetButton("Build Turret"))
        {
            builder.Build("Turret");
            animator.SetTrigger("Building");
            currentFrameState.BuildTurret = true;
        }
        if (Input.GetButton("Shoot"))
        {
            shooter.Shoot();
            animator.SetTrigger("Shoot");
            currentFrameState.Shoot = true;
        }
        if (Input.GetMouseButtonDown(0))
        {
            shooter.Shoot(Camera.main.ScreenToWorldPoint(Input.mousePosition));
            animator.SetTrigger("Shoot");
            currentFrameState.Shoot = true;
        }
        if (Input.GetButton("Destroy Structure"))
        {
            builder.DestroyStructure();
            animator.SetTrigger("Building");
            currentFrameState.DestroyStructure = true;
        }
    }

    void LateUpdate()
    {
        UpdateFrameStates();
    }

    void OnDestroy()
    {
        if (!isApplicationQuitting)
        {
            GetComponent<Mobility>().Moveable = false;
            animator.SetTrigger("Die");
            GameManager.Instance.PlayerLives--;
            GameManager.Instance.ResetCurrentFrame();
            GameObject ghosts = GameObject.Find("Ghosts");
            GameObject ghost = Instantiate(Resources.Load("Ghost")) as GameObject;
            ghost.transform.parent = ghosts.transform;
            GhostController ghostController = ghost.GetComponent<GhostController>();
            ghostController.FrameStates = frameStates;
            GameObject.Find("Game Manager").AddComponent<LevelLoader>();
        }
    }

    void OnApplicationQuit()
    {
        isApplicationQuitting = true;
    }

    private void UpdateFrameStates()
    {
        if (currentFrameState == null)
        {
            currentFrameState = new FrameState();
        }
        currentFrameState.Position = transform.position;
        currentFrameState.Rotation = transform.rotation.eulerAngles;
        frameStates.Add(currentFrameState);
    }
}
