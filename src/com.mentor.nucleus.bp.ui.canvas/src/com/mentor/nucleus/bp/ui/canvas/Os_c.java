package com.mentor.nucleus.bp.ui.canvas;
//====================================================================
//
// File:      com.mentor.nucleus.bp.ui.canvas.Os_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// Operating System
public class Os_c {
	public static java.util.UUID Null_unique_id() {
		return com.mentor.nucleus.bp.core.common.IdAssigner.NULL_UUID;
	} // End NULL_UNIQUE_ID

	public static int Max_int() {
		return Integer.MAX_VALUE;
	} // End MAX_INT

	public static boolean Ismultiline(final String p_Text) {
		return p_Text.indexOf('\n') != -1;
	} // End isMultiLine

	public static int Realtoint(final float p_Value) {
		return (int) p_Value;
	} // End realToInt

	public static float Inttoreal(final int p_Value) {
		return (float) p_Value;
	} // End intToReal

	public static float Getsquareroot(final float p_Value) {
		/*
		 Returns the square root of the given non-negative value.
		 */
		return (float) Math.sqrt(p_Value);
	} // End getSquareRoot

	public static Object Null_instance() {
		return null;
	} // End NULL_INSTANCE

	public static String Uniqueidtostring(final java.util.UUID p_Id) {
		return p_Id.toString();
	} // End uniqueIdToString

	public static String Newline() {
		return System.getProperty("line.separator");
	} // End newLine

} // End Os_c
