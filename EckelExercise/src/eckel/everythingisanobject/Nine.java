package eckel.everythingisanobject;

import javax.security.auth.login.FailedLoginException;

/*
 * Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
 */

public class Nine {
    public static void main(String[] args) {
	// boolean
	boolean bool = true;
	Boolean boolean1 = new Boolean(bool);
	bool = boolean1;
	boolean1 = false;
	// char
	char c = 'a';
	Character character = new Character(c);
	c = character;
	character = 'x';
	// byte
	byte b = 1;
	Byte byte1 = new Byte(b);
	b = byte1;
	byte1 = 0;
	// short
	short s = 12;
	Short short1 = new Short(s);
	s = short1;
	short1 = 32;
	// int
	int i = 11;
	Integer integer = new Integer(i);
	i = integer;
	integer = 22;
	// long
	long l = 2L;
	Long long1 = new Long(l);
	l = long1;
	long1 = 3L;
	// float
	float f = 4;
	Float float1 = new Float(f);
	f = float1;
	float1 = 5F;
	// double
	double d = 1.1;
	Double double1 = new Double(d);
	d = double1;
	double1 = 2.2;

    }
}
