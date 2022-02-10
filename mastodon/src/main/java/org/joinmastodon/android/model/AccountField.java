package org.joinmastodon.android.model;

import org.joinmastodon.android.api.RequiredField;
import org.parceler.Parcel;
import org.parceler.Transient;

import java.time.Instant;

/**
 * Represents a profile field as a name-value pair with optional verification.
 */
@Parcel
public class AccountField extends BaseModel{
	/**
	 * The key of a given field's key-value pair.
	 */
	@RequiredField
	public String name;
	/**
	 * The value associated with the name key.
	 */
	@RequiredField
	public String value;
	/**
	 * Timestamp of when the server verified a URL value for a rel="me” link.
	 */
	public Instant verifiedAt;

	public transient CharSequence parsedValue;

	@Override
	public String toString(){
		return "AccountField{"+
				"name='"+name+'\''+
				", value='"+value+'\''+
				", verifiedAt="+verifiedAt+
				'}';
	}
}