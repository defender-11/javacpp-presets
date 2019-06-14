// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Wheel joint definition. This requires defining a line of
 *  motion using an axis and an anchor point. The definition uses local
 *  anchor points and a local axis so that the initial configuration
 *  can violate the constraint slightly. The joint translation is zero
 *  when the local anchor points coincide in world space. Using local
 *  anchors and a local axis helps when saving and loading a game. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2WheelJointDef extends b2JointDef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2WheelJointDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2WheelJointDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2WheelJointDef position(long position) {
        return (b2WheelJointDef)super.position(position);
    }

	public b2WheelJointDef() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Initialize the bodies, anchors, axis, and reference angle using the world
	 *  anchor and world axis. */
	public native void Initialize(b2Body bodyA, b2Body bodyB, @Const @ByRef b2Vec2 anchor, @Const @ByRef b2Vec2 axis);

	/** The local anchor point relative to bodyA's origin. */
	public native @ByRef b2Vec2 localAnchorA(); public native b2WheelJointDef localAnchorA(b2Vec2 setter);

	/** The local anchor point relative to bodyB's origin. */
	public native @ByRef b2Vec2 localAnchorB(); public native b2WheelJointDef localAnchorB(b2Vec2 setter);

	/** The local translation axis in bodyA. */
	public native @ByRef b2Vec2 localAxisA(); public native b2WheelJointDef localAxisA(b2Vec2 setter);

	/** Enable/disable the joint motor. */
	public native @Cast("bool") boolean enableMotor(); public native b2WheelJointDef enableMotor(boolean setter);

	/** The maximum motor torque, usually in N-m. */
	public native @Cast("float32") float maxMotorTorque(); public native b2WheelJointDef maxMotorTorque(float setter);

	/** The desired motor speed in radians per second. */
	public native @Cast("float32") float motorSpeed(); public native b2WheelJointDef motorSpeed(float setter);

	/** Suspension frequency, zero indicates no suspension */
	public native @Cast("float32") float frequencyHz(); public native b2WheelJointDef frequencyHz(float setter);

	/** Suspension damping ratio, one indicates critical damping */
	public native @Cast("float32") float dampingRatio(); public native b2WheelJointDef dampingRatio(float setter);
}