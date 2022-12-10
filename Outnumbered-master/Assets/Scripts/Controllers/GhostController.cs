using UnityEngine;
using System.Collections;
using System.Collections.Generic;

[RequireComponent(typeof(Animator))]
[RequireComponent(typeof(Rigidbody2D))]
[RequireComponent(typeof(Mobility))]
[RequireComponent(typeof(Builder))]
[RequireComponent(typeof(Shooter))]
[RequireComponent(typeof(Turret))]
public class GhostController : MonoBehaviour
{
    public List<FrameState> FrameStates { get; set; }

    private Animator animator;
    private Mobility mobility;
    private Builder builder;
    private Shooter shooter;
    private Turret turret;
    private FrameState currentFrameState;

    void Start()
    {
        animator = GetComponent<Animator>();
        mobility = GetComponent<Mobility>();
        builder = GetComponent<Builder>();
        shooter = GetComponent<Shooter>();
        turret = GetComponent<Turret>();
    }

    void Update()
    {
        if (FrameStates == null)
        {
            return;
        }
        if (FrameStates.Count > GameManager.Instance.CurrentFrame)
        {
            FrameState currentFrameState = FrameStates[GameManager.Instance.CurrentFrame];
            transform.position = currentFrameState.Position;
            transform.eulerAngles = currentFrameState.Rotation;
            if (currentFrameState.BuildBarricade)
            {
                builder.Build("Barricade");
                animator.SetTrigger("Building");
            }
            if (currentFrameState.BuildTurret)
            {
                builder.Build("Turret");
                animator.SetTrigger("Building");
            }
            if (currentFrameState.DestroyStructure)
            {
                builder.DestroyStructure();
                animator.SetTrigger("Building");
            }
            if (currentFrameState.Shoot)
            {
                shooter.Shoot();
                animator.SetTrigger("Shoot");
            }
            transform.position = currentFrameState.Position;
            transform.eulerAngles = currentFrameState.Rotation;
        }
        else
        {
            turret.enabled = true;
        }
    }
}