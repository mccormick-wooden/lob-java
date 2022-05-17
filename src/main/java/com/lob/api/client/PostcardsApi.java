/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> Looking for our [previous documentation](https://lob.github.io/legacy-docs/)? 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lob.api.client;

import com.lob.api.ApiCallback;
import com.lob.api.ApiClient;
import com.lob.api.ApiException;
import com.lob.api.ApiResponse;
import com.lob.api.Configuration;
import com.lob.api.Pair;
import com.lob.api.ProgressRequestBody;
import com.lob.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.LobError;
import org.openapitools.client.model.MailType;
import org.openapitools.client.model.Postcard;
import org.openapitools.client.model.PostcardDeletion;
import org.openapitools.client.model.PostcardEditable;
import org.openapitools.client.model.PostcardList;
import org.openapitools.client.model.PostcardSize;
import org.openapitools.client.model.SendDate;
import org.openapitools.client.model.SortBy5;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostcardsApi {
    private ApiClient localVarApiClient;

    public PostcardsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PostcardsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for create
     * @param postcardEditable  (required)
     * @param idempotencyKey A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createCall(PostcardEditable postcardEditable, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = postcardEditable;

        // create path and map variables
        String localVarPath = "/postcards";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (idempotencyKey != null) {
            localVarHeaderParams.put("Idempotency-Key", localVarApiClient.parameterToString(idempotencyKey));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createValidateBeforeCall(PostcardEditable postcardEditable, String idempotencyKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'postcardEditable' is set
        if (postcardEditable == null) {
            throw new ApiException("Missing the required parameter 'postcardEditable' when calling create(Async)");
        }
        

        okhttp3.Call localVarCall = createCall(postcardEditable, idempotencyKey, _callback);
        return localVarCall;

    }

    /**
     * create
     * Creates a new postcard given information
     * @param postcardEditable  (required)
     * @param idempotencyKey A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).  (optional)
     * @return Postcard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public Postcard create(PostcardEditable postcardEditable, String idempotencyKey) throws ApiException {
        try {
            ApiResponse<Postcard> localVarResp = createWithHttpInfo(postcardEditable, idempotencyKey);
            return localVarResp.getData();
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * create
     * Creates a new postcard given information
     * @param postcardEditable  (required)
     * @param idempotencyKey A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).  (optional)
     * @return ApiResponse&lt;Postcard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Postcard> createWithHttpInfo(PostcardEditable postcardEditable, String idempotencyKey) throws ApiException {
        try {
            okhttp3.Call localVarCall = createValidateBeforeCall(postcardEditable, idempotencyKey, null);
            Type localVarReturnType = new TypeToken<Postcard>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * create (asynchronously)
     * Creates a new postcard given information
     * @param postcardEditable  (required)
     * @param idempotencyKey A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our [implementation guide](https://www.lob.com/guides#idempotent_request).  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createAsync(PostcardEditable postcardEditable, String idempotencyKey, final ApiCallback<Postcard> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(postcardEditable, idempotencyKey, _callback);
        Type localVarReturnType = new TypeToken<Postcard>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancel
     * @param pscId id of the postcard (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deleted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelCall(String pscId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/postcards/{psc_id}"
            .replaceAll("\\{" + "psc_id" + "\\}", localVarApiClient.escapeString(pscId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelValidateBeforeCall(String pscId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pscId' is set
        if (pscId == null) {
            throw new ApiException("Missing the required parameter 'pscId' when calling cancel(Async)");
        }
        

        okhttp3.Call localVarCall = cancelCall(pscId, _callback);
        return localVarCall;

    }

    /**
     * cancel
     * Completely removes a postcard from production. This can only be done if the postcard has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print &amp; Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.
     * @param pscId id of the postcard (required)
     * @return PostcardDeletion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deleted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public PostcardDeletion cancel(String pscId) throws ApiException {
        try {
            ApiResponse<PostcardDeletion> localVarResp = cancelWithHttpInfo(pscId);
            return localVarResp.getData();
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * cancel
     * Completely removes a postcard from production. This can only be done if the postcard has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print &amp; Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.
     * @param pscId id of the postcard (required)
     * @return ApiResponse&lt;PostcardDeletion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deleted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostcardDeletion> cancelWithHttpInfo(String pscId) throws ApiException {
        try {
            okhttp3.Call localVarCall = cancelValidateBeforeCall(pscId, null);
            Type localVarReturnType = new TypeToken<PostcardDeletion>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * cancel (asynchronously)
     * Completely removes a postcard from production. This can only be done if the postcard has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate [Print &amp; Mail Edition](https://dashboard.lob.com/#/settings/editions) to gain access.
     * @param pscId id of the postcard (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Deleted </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelAsync(String pscId, final ApiCallback<PostcardDeletion> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelValidateBeforeCall(pscId, _callback);
        Type localVarReturnType = new TypeToken<PostcardDeletion>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for get
     * @param pscId id of the postcard (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCall(String pscId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/postcards/{psc_id}"
            .replaceAll("\\{" + "psc_id" + "\\}", localVarApiClient.escapeString(pscId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String pscId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'pscId' is set
        if (pscId == null) {
            throw new ApiException("Missing the required parameter 'pscId' when calling get(Async)");
        }
        

        okhttp3.Call localVarCall = getCall(pscId, _callback);
        return localVarCall;

    }

    /**
     * get
     * Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.
     * @param pscId id of the postcard (required)
     * @return Postcard
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public Postcard get(String pscId) throws ApiException {
        try {
            ApiResponse<Postcard> localVarResp = getWithHttpInfo(pscId);
            return localVarResp.getData();
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * get
     * Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.
     * @param pscId id of the postcard (required)
     * @return ApiResponse&lt;Postcard&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Postcard> getWithHttpInfo(String pscId) throws ApiException {
        try {
            okhttp3.Call localVarCall = getValidateBeforeCall(pscId, null);
            Type localVarReturnType = new TypeToken<Postcard>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * get (asynchronously)
     * Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.
     * @param pscId id of the postcard (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a postcard object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAsync(String pscId, final ApiCallback<Postcard> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(pscId, _callback);
        Type localVarReturnType = new TypeToken<Postcard>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for list
     * @param limit How many results to return. (optional, default to 10)
     * @param before A reference to a list entry used for paginating to the previous set of entries. This field is pre-populated in the &#x60;previous_url&#x60; field in the return response.  (optional)
     * @param after A reference to a list entry used for paginating to the next set of entries. This field is pre-populated in the &#x60;next_url&#x60; field in the return response.  (optional)
     * @param include Request that the response include the total count by specifying &#x60;include[]&#x3D;total_count&#x60;.  (optional)
     * @param dateCreated Filter by date created. (optional)
     * @param metadata Filter by metadata key-value pair&#x60;. (optional)
     * @param size Specifies the size of the postcard. Only &#x60;4x6&#x60; postcards can be sent to international destinations. (optional)
     * @param scheduled * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  (optional)
     * @param sendDate Filter by ISO-8601 date or datetime, e.g. &#x60;{ gt: &#39;2012-01-01&#39;, lt: &#39;2012-01-31T12:34:56Z&#39; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  (optional)
     * @param mailType A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A dictionary with a data property that contains an array of up to &#x60;limit&#x60; postcards. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCall(Integer limit, String before, String after, List<String> include, Map<String, String> dateCreated, Map<String, String> metadata, PostcardSize size, Boolean scheduled, SendDate sendDate, MailType mailType, SortBy5 sortBy, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/postcards";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (before != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("before", before));
        }

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "include", include));
        }

        if (dateCreated != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_created", dateCreated));
        }

        if (metadata != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("metadata", metadata));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (scheduled != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scheduled", scheduled));
        }

        if (sendDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("send_date", sendDate));
        }

        if (mailType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mail_type", mailType));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_by", sortBy));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listValidateBeforeCall(Integer limit, String before, String after, List<String> include, Map<String, String> dateCreated, Map<String, String> metadata, PostcardSize size, Boolean scheduled, SendDate sendDate, MailType mailType, SortBy5 sortBy, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listCall(limit, before, after, include, dateCreated, metadata, size, scheduled, sendDate, mailType, sortBy, _callback);
        return localVarCall;

    }

    /**
     * list
     * Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param before A reference to a list entry used for paginating to the previous set of entries. This field is pre-populated in the &#x60;previous_url&#x60; field in the return response.  (optional)
     * @param after A reference to a list entry used for paginating to the next set of entries. This field is pre-populated in the &#x60;next_url&#x60; field in the return response.  (optional)
     * @param include Request that the response include the total count by specifying &#x60;include[]&#x3D;total_count&#x60;.  (optional)
     * @param dateCreated Filter by date created. (optional)
     * @param metadata Filter by metadata key-value pair&#x60;. (optional)
     * @param size Specifies the size of the postcard. Only &#x60;4x6&#x60; postcards can be sent to international destinations. (optional)
     * @param scheduled * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  (optional)
     * @param sendDate Filter by ISO-8601 date or datetime, e.g. &#x60;{ gt: &#39;2012-01-01&#39;, lt: &#39;2012-01-31T12:34:56Z&#39; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  (optional)
     * @param mailType A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  (optional)
     * @return PostcardList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A dictionary with a data property that contains an array of up to &#x60;limit&#x60; postcards. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public PostcardList list(Integer limit, String before, String after, List<String> include, Map<String, String> dateCreated, Map<String, String> metadata, PostcardSize size, Boolean scheduled, SendDate sendDate, MailType mailType, SortBy5 sortBy) throws ApiException {
        try {
            ApiResponse<PostcardList> localVarResp = listWithHttpInfo(limit, before, after, include, dateCreated, metadata, size, scheduled, sendDate, mailType, sortBy);
            return localVarResp.getData();
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * list
     * Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param before A reference to a list entry used for paginating to the previous set of entries. This field is pre-populated in the &#x60;previous_url&#x60; field in the return response.  (optional)
     * @param after A reference to a list entry used for paginating to the next set of entries. This field is pre-populated in the &#x60;next_url&#x60; field in the return response.  (optional)
     * @param include Request that the response include the total count by specifying &#x60;include[]&#x3D;total_count&#x60;.  (optional)
     * @param dateCreated Filter by date created. (optional)
     * @param metadata Filter by metadata key-value pair&#x60;. (optional)
     * @param size Specifies the size of the postcard. Only &#x60;4x6&#x60; postcards can be sent to international destinations. (optional)
     * @param scheduled * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  (optional)
     * @param sendDate Filter by ISO-8601 date or datetime, e.g. &#x60;{ gt: &#39;2012-01-01&#39;, lt: &#39;2012-01-31T12:34:56Z&#39; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  (optional)
     * @param mailType A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  (optional)
     * @return ApiResponse&lt;PostcardList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A dictionary with a data property that contains an array of up to &#x60;limit&#x60; postcards. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostcardList> listWithHttpInfo(Integer limit, String before, String after, List<String> include, Map<String, String> dateCreated, Map<String, String> metadata, PostcardSize size, Boolean scheduled, SendDate sendDate, MailType mailType, SortBy5 sortBy) throws ApiException {
        try {
            okhttp3.Call localVarCall = listValidateBeforeCall(limit, before, after, include, dateCreated, metadata, size, scheduled, sendDate, mailType, sortBy, null);
            Type localVarReturnType = new TypeToken<PostcardList>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            throw e;
        }
    }

    /**
     * list (asynchronously)
     * Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param before A reference to a list entry used for paginating to the previous set of entries. This field is pre-populated in the &#x60;previous_url&#x60; field in the return response.  (optional)
     * @param after A reference to a list entry used for paginating to the next set of entries. This field is pre-populated in the &#x60;next_url&#x60; field in the return response.  (optional)
     * @param include Request that the response include the total count by specifying &#x60;include[]&#x3D;total_count&#x60;.  (optional)
     * @param dateCreated Filter by date created. (optional)
     * @param metadata Filter by metadata key-value pair&#x60;. (optional)
     * @param size Specifies the size of the postcard. Only &#x60;4x6&#x60; postcards can be sent to international destinations. (optional)
     * @param scheduled * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  (optional)
     * @param sendDate Filter by ISO-8601 date or datetime, e.g. &#x60;{ gt: &#39;2012-01-01&#39;, lt: &#39;2012-01-31T12:34:56Z&#39; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  (optional)
     * @param mailType A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a [cheaper option](https://lob.com/pricing/print-mail#compare) which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A dictionary with a data property that contains an array of up to &#x60;limit&#x60; postcards. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Lob uses RESTful HTTP response codes to indicate success or failure of an API request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAsync(Integer limit, String before, String after, List<String> include, Map<String, String> dateCreated, Map<String, String> metadata, PostcardSize size, Boolean scheduled, SendDate sendDate, MailType mailType, SortBy5 sortBy, final ApiCallback<PostcardList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listValidateBeforeCall(limit, before, after, include, dateCreated, metadata, size, scheduled, sendDate, mailType, sortBy, _callback);
        Type localVarReturnType = new TypeToken<PostcardList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
