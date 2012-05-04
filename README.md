# OrderBugTestAndGenerator

In my generator I'm adding a property called "Order":

    note.addIntProperty("order");

Thus order is a reserved word for SQLite it will yield an Error in the application, would be wonderful
if the Generator would throw an Exception or Warning. This is the resulting error in the app:

    E/AndroidRuntime( 1500): FATAL EXCEPTION: main
    E/AndroidRuntime( 1500): java.lang.RuntimeException: Unable to start activity ComponentInfo{com.nineelements.orderbugtest/com.nineelements.orderbugtest.OrderBugTestActivity}: android.database.sqlite.SQLiteException: near "ORDER": syntax error: , while compiling: SELECT _id, TEXT, ORDER, COMMENT, DATE FROM NOTE ORDER BY ORDER ASC
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:1622)
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:1638)
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread.access$1500(ActivityThread.java:117)
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:928)
    E/AndroidRuntime( 1500): 	at android.os.Handler.dispatchMessage(Handler.java:99)
    E/AndroidRuntime( 1500): 	at android.os.Looper.loop(Looper.java:123)
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread.main(ActivityThread.java:3647)
    E/AndroidRuntime( 1500): 	at java.lang.reflect.Method.invokeNative(Native Method)
    E/AndroidRuntime( 1500): 	at java.lang.reflect.Method.invoke(Method.java:507)
    E/AndroidRuntime( 1500): 	at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:839)
    E/AndroidRuntime( 1500): 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:597)
    E/AndroidRuntime( 1500): 	at dalvik.system.NativeStart.main(Native Method)
    E/AndroidRuntime( 1500): Caused by: android.database.sqlite.SQLiteException: near "ORDER": syntax error: , while compiling: SELECT _id, TEXT, ORDER, COMMENT, DATE FROM NOTE ORDER BY ORDER ASC
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteCompiledSql.native_compile(Native Method)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteCompiledSql.compile(SQLiteCompiledSql.java:92)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteCompiledSql.<init>(SQLiteCompiledSql.java:65)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteProgram.<init>(SQLiteProgram.java:83)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteQuery.<init>(SQLiteQuery.java:49)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteDirectCursorDriver.query(SQLiteDirectCursorDriver.java:42)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteDatabase.rawQueryWithFactory(SQLiteDatabase.java:1356)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteDatabase.queryWithFactory(SQLiteDatabase.java:1235)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteDatabase.query(SQLiteDatabase.java:1189)
    E/AndroidRuntime( 1500): 	at android.database.sqlite.SQLiteDatabase.query(SQLiteDatabase.java:1271)
    E/AndroidRuntime( 1500): 	at com.nineelements.orderbugtest.OrderBugTestActivity.onCreate(OrderBugTestActivity.java:37)
    E/AndroidRuntime( 1500): 	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1047)
    E/AndroidRuntime( 1500): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:1586)
    E/AndroidRuntime( 1500): 	... 11 more
