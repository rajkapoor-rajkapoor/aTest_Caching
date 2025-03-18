

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class data

{
	// ---( internal utility methods )---

	final static data _instance = new data();

	static data _newInstance() { return new data(); }

	static data _cast(Object o) { return (data)o; }

	// ---( server methods )---




	public static final void NosigJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(NosigJava)>> ---
		// @sigtype java 3.5
	
		// --- <<IS-END>> ---

                
	}



	public static final void sigJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sigJava)>> ---
		// @sigtype java 3.5
		// [i] field:0:required Data
		// [o] field:0:required DataOut
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	Data = IDataUtil.getString( pipelineCursor, "Data" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "DataOut", "dataupdate" );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

