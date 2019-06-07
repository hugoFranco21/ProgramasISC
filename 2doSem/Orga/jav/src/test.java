// This sample uses the Apache HTTP client library(org.apache.httpcomponents:httpclient:4.2.4)
// and the org.json library (org.json:json:20170516).
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
public class Main
{
// **********************************************
/*** Update or verify the following values. ***
This article provides information and code samples to help you quickly get started using the Face API with Java to
accomplish the following tasks:
Detect Faces in Images
Create a PersonGroup
Get the Microsoft Face API Android SDK here
Learn more about obtaining free subscription keys here
Use the Face - Detect method to detect faces in an image and return face attributes including:
Face ID: Unique ID used in several Face API scenarios.
Face Rectangle: The left, top, width, and height indicating the location of the face in the image.
Landmarks: An array of 27-point face landmarks pointing to the important positions of face components.
Facial attributes including age, gender, smile intensity, head pose, and facial hair.
To run the sample, perform the following steps:
1. Create a new Command Line App.
2. Replace the Main class with the following code (keep any package statements).
3. Replace the subscriptionKey value with your valid subscription key.
4. Change the uriBase value to use the location where you obtained your subscription keys, if necessary.
5. Download these global libraries from the Maven Repository to the lib directory in your project:
6. Run 'Main'.
org.apache.httpcomponents:httpclient:4.2.4
org.json:json:20170516*/
// *** Update or verify the following values. ***
// **********************************************
// Replace the subscriptionKey string value with your valid subscription key.
public static final String subscriptionKey = "430f8928c89f483c882e71a3376208ba";
// Replace or verify the region.
//
// You must use the same region in your REST API call as you used to obtain your subscription keys.
// For example, if you obtained your subscription keys from the westus region, replace
// "westcentralus" in the URI below with "westus".
//
// NOTE: Free trial subscription keys are generated in the westcentralus region, so if you are using
// a free trial subscription key, you should not need to change this region.*/
public static final String uriBase = "https://westcentralus.api.cognitive.microsoft.com/face/v1.0/detect";
public static void main(String[] args)
{
HttpClient httpclient = new DefaultHttpClient();
try
{
URIBuilder builder = new URIBuilder(uriBase);
// Request parameters. All of them are optional.
builder.setParameter("returnFaceId", "true");
builder.setParameter("returnFaceLandmarks", "false");
builder.setParameter("returnFaceAttributes",
"age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise");
// Prepare the URI for the REST API call.
URI uri = builder.build();
HttpPost request = new HttpPost(uri);
// Request headers.
request.setHeader("Content-Type", "application/json");
request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);
// Request body.
StringEntity reqEntity = new StringEntity("
{\"url\":\"https://upload.wikimedia.org/wikipedia/commons/c/c3/RH_Louise_Lillian_Gish.jpg\"}");
request.setEntity(reqEntity);
// Execute the REST API call and get the response entity.
HttpResponse response = httpclient.execute(request);
HttpEntity entity = response.getEntity();
if (entity != null)
{
// Format and display the JSON response.
System.out.println("REST Response:\n");
String jsonString = EntityUtils.toString(entity).trim();
if (jsonString.charAt(0) == '[') {
JSONArray jsonArray = new JSONArray(jsonString);
System.out.println(jsonArray.toString(2));
}
else if (jsonString.charAt(0) == '{') {
JSONObject jsonObject = new JSONObject(jsonString);
System.out.println(jsonObject.toString(2));
} else {
System.out.println(jsonString);
}
}
}
catch (Exception e)
{
// Display error message.
System.out.println(e.getMessage());
}
}
}