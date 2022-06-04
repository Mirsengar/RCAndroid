package contagiouscode.mirsengar.rcandroid.api;




import java.util.HashMap;


public
interface MzQAPI {


@POST ( app.main.Version + "/Data/Login" )
Call < UserModel > Login ( @Body HashMap < String, String > body );


@POST ( app.main.Version + "/Commuting/Insert" )
Call < MainResponseModel > InsertCommuting ( @Body CachedCommutingObject object );


@POST ( app.main.Version + "/Commuting/Get" )
Call < List < CommutingObject > > GetCommuting ( @Body HashMap < String, String > body );


//    @POST(app.main.Version+"/Data/Get")
//    Call<List<PeopleObject>> GetData(@Body HashMap<String , String> body);


@POST ( app.main.Version + "/Data/Get" )
@Streaming
public
Call < List < PeopleObject > > GetData ( @Body HashMap < String, String > body );

}
