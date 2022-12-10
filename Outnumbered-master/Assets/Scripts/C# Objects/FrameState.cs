using UnityEngine;
using System.Collections;

public class FrameState {
    public Vector2 Position { get; set; }
    public Vector3 Rotation { get; set; }
    public bool BuildBarricade { get; set; }
    public bool BuildTurret { get; set; }
    public bool DestroyStructure { get; set; }
    public bool Shoot { get; set; }
}