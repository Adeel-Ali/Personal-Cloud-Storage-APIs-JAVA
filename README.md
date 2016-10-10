# Getting Started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

## How to Use

The following section explains how to use the PersonalCloudStorageAPIs library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *PersonalCloudStorageAPIsLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify PersonalCloudStorageAPIs in ``` Group Id ``` and PersonalCloudStorageAPIsLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Personal%20Cloud%20Storage%20APIs-Java&workspaceName=PersonalCloudStorageAPIs&projectName=PersonalCloudStorageAPIsLib&rootNamespace=com.verizon.cloudapi.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *PersonalCloudStorageAPIsLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication and Initialization
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthAccessToken | The OAuth 2.0 access token to be set before API calls |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String oAuthAccessToken = "oAuthAccessToken"; // The OAuth 2.0 access token to be set before API calls

PersonalCloudStorageAPIsClient client = new PersonalCloudStorageAPIsClient(oAuthAccessToken);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [AccountInfoController](#account_info_controller)
* [TagsController](#tags_controller)
* [ContactsController](#contacts_controller)
* [FilesFoldersController](#files_folders_controller)
* [PlaylistsController](#playlists_controller)
* [SharesController](#shares_controller)

### <a name="account_info_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.AccountInfoController") AccountInfoController

#### Get singleton instance

The singleton instance of the ``` AccountInfoController ``` class can be accessed from the API Client.

```java
AccountInfoController accountInfo = client.getAccountInfo();
```

#### <a name="get_account_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.AccountInfoController.getAccountAsync") getAccountAsync

> Retrieve quota usage details.


```java
void getAccountAsync(final APICallBack<AccountResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
accountInfo.getAccountAsync(new APICallBack<AccountResponse>() {
    public void onSuccess(HttpContext context, AccountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)

### <a name="tags_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.TagsController") TagsController

#### Get singleton instance

The singleton instance of the ``` TagsController ``` class can be accessed from the API Client.

```java
TagsController tags = client.getTags();
```

#### <a name="get_tags_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.TagsController.getTagsAsync") getTagsAsync

> Get the list of tags on a file or folder.


```java
void getTagsAsync(
        final String path,
        final APICallBack<TagsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | The path to the file or folder for which tags need to be retrieved |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
tags.getTagsAsync(path, new APICallBack<TagsResponse>() {
    public void onSuccess(HttpContext context, TagsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File or folder was not found. |
| 410 | [Gone] File or folder was removed. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="delete_tags_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.TagsController.deleteTagsAsync") deleteTagsAsync

> Delete the tags on a file or folder.


```java
void deleteTagsAsync(
        final String uri,
        final Boolean createVersion,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| uri |  ``` Required ```  | URI of the resource. This is a URI value obtained from a fullview or metadata response |
| createVersion |  ``` Optional ```  ``` DefaultValue ```  | If 'true', creates a new version of the file or folder. Defaults to 'false'. |


#### Example Usage

```java
String uri = "uri";
Boolean createVersion = false;
// Invoking the API call with sample inputs
tags.deleteTagsAsync(uri, createVersion, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File or folder was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="update_tags_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.TagsController.updateTagsAsync") updateTagsAsync

> Update the tags on a file or folder.


```java
void updateTagsAsync(
        final UpdateTagsRequest updateTags,
        final APICallBack<TagsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| updateTags |  ``` Required ```  | Allows a user to update Tags on a file or folder |


#### Example Usage

```java
try {
    UpdateTagsRequest updateTags = new UpdateTagsRequest();
    // Invoking the API call with sample inputs
    tags.updateTagsAsync(updateTags, new APICallBack<TagsResponse>() {
        public void onSuccess(HttpContext context, TagsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File or folder was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)

### <a name="contacts_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.ContactsController") ContactsController

#### Get singleton instance

The singleton instance of the ``` ContactsController ``` class can be accessed from the API Client.

```java
ContactsController contacts = client.getContacts();
```

#### <a name="get_contacts_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.ContactsController.getContactsAsync") getContactsAsync

> Retrieves all contacts.


```java
void getContactsAsync(final APICallBack<Contacts> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
contacts.getContactsAsync(new APICallBack<Contacts>() {
    public void onSuccess(HttpContext context, Contacts response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 500 | Unexpected Account configuration. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)

### <a name="files_folders_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.FilesFoldersController") FilesFoldersController

#### Get singleton instance

The singleton instance of the ``` FilesFoldersController ``` class can be accessed from the API Client.

```java
FilesFoldersController filesFolders = client.getFilesFolders();
```

#### <a name="create_restore_trash_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.createRestoreTrashAsync") createRestoreTrashAsync

> Restores files or folders.


```java
void createRestoreTrashAsync(
        final DeletedList trashcanItems,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| trashcanItems |  ``` Required ```  | Request object to restore files or folders from trash. |


#### Example Usage

```java
try {
    DeletedList trashcanItems = new DeletedList();
    // Invoking the API call with sample inputs
    filesFolders.createRestoreTrashAsync(trashcanItems, new APICallBack<DynamicResponse>() {
        public void onSuccess(HttpContext context, DynamicResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Path is invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_fullview_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getFullviewAsync") getFullviewAsync

> Retrieve information on all file and folder content.


```java
void getFullviewAsync(
        final String virtualfolder,
        final String xHeaderETag,
        final APICallBack<FullviewResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| virtualfolder |  ``` Optional ```  | Folder that represents various client types at the root level and contains their respective data. |
| xHeaderETag |  ``` Optional ```  | Omit this header to request a full response.  To request only changes since a previous call to fullview, include this header as copied from your previous /fullview response. |


#### Example Usage

```java
String virtualfolder = "virtualfolder";
String xHeaderETag = "X-Header-ETag";
// Invoking the API call with sample inputs
filesFolders.getFullviewAsync(virtualfolder, xHeaderETag, new APICallBack<FullviewResponse>() {
    public void onSuccess(HttpContext context, FullviewResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 412 | [Precondition Failed] An X-Header-ETag header was included in the request, and there are no changes to report. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_files_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getFilesAsync") getFilesAsync

> Retrieves file content.


```java
void getFilesAsync(
        final String path,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | The path to the file or folder. |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
filesFolders.getFilesAsync(path, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_rename_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.postRenameAsync") postRenameAsync

> Rename a file/folder.


```java
void postRenameAsync(
        final FopsChangeRequest fileRenameRequest,
        final APICallBack<MetadataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fileRenameRequest |  ``` Required ```  | 'safe' and 'conflictsolve' are optional parameters in the request object to rename a file/folder. |


#### Example Usage

```java
try {
    FopsChangeRequest fileRenameRequest = new FopsChangeRequest();
    // Invoking the API call with sample inputs
    filesFolders.postRenameAsync(fileRenameRequest, new APICallBack<MetadataResponse>() {
        public void onSuccess(HttpContext context, MetadataResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 409 | Conflict. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_move_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.postMoveAsync") postMoveAsync

> Move a file or folder.


```java
void postMoveAsync(
        final FopsChangeRequest fileMoveRequest,
        final APICallBack<MetadataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fileMoveRequest |  ``` Required ```  | 'safe' and 'conflictsolve' are optional parameters in the request object to move a file/folder. |


#### Example Usage

```java
try {
    FopsChangeRequest fileMoveRequest = new FopsChangeRequest();
    // Invoking the API call with sample inputs
    filesFolders.postMoveAsync(fileMoveRequest, new APICallBack<MetadataResponse>() {
        public void onSuccess(HttpContext context, MetadataResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 409 | Conflict. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_copy_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.postCopyAsync") postCopyAsync

> Create a copy of a file/folder.


```java
void postCopyAsync(
        final FopsCopyRequest fileCopyRequest,
        final APICallBack<MetadataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fileCopyRequest |  ``` Required ```  | 'safe', 'conflictsolve' and 'override' are optional parameters in the request object to copy a file/folder. |


#### Example Usage

```java
try {
    FopsCopyRequest fileCopyRequest = new FopsCopyRequest();
    // Invoking the API call with sample inputs
    filesFolders.postCopyAsync(fileCopyRequest, new APICallBack<MetadataResponse>() {
        public void onSuccess(HttpContext context, MetadataResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 409 | Conflict. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="delete_delete_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.deleteDeleteAsync") deleteDeleteAsync

> Delete a file/folder.


```java
void deleteDeleteAsync(
        final String path,
        final Boolean purge,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | Full path of the file/folder to be deleted. |
| purge |  ``` Optional ```  ``` DefaultValue ```  | If 'true', permanently deletes the file/folder. |


#### Example Usage

```java
String path = "path";
Boolean purge = false;
// Invoking the API call with sample inputs
filesFolders.deleteDeleteAsync(path, purge, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_createfolder_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.postCreatefolderAsync") postCreatefolderAsync

> Create a folder.


```java
void postCreatefolderAsync(
        final FolderRequest folder,
        final APICallBack<FolderMetadata> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| folder |  ``` Required ```  | 'override' is an optional parameter in the request object to create a folder. |


#### Example Usage

```java
try {
    FolderRequest folder = new FolderRequest();
    // Invoking the API call with sample inputs
    filesFolders.postCreatefolderAsync(folder, new APICallBack<FolderMetadata>() {
        public void onSuccess(HttpContext context, FolderMetadata response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Path was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="upload_file_create_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.uploadFileCreateAsync") uploadFileCreateAsync

> Completes chunk file upload.


```java
void uploadFileCreateAsync(
        final String uploadid,
        final APICallBack<FileMetadata> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| uploadid |  ``` Required ```  | Unique id to upload file binary content and to create the file. Uploadid is obtained via a call to the /fileupload/intent API (it is embedded in the URLs included in the response). |


#### Example Usage

```java
String uploadid = "uploadid";
// Invoking the API call with sample inputs
filesFolders.uploadFileCreateAsync(uploadid, new APICallBack<FileMetadata>() {
    public void onSuccess(HttpContext context, FileMetadata response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="retrieve_trash_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.retrieveTrashAsync") retrieveTrashAsync

> Retrieves a list of deleted files and folders from a single user repository.


```java
void retrieveTrashAsync(
        final String virtualfolder,
        final String sort,
        final Integer start,
        final Integer count,
        final String filter,
        final Boolean deep,
        final APICallBack<TrashResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| virtualfolder |  ``` Required ```  | Folder that represents various client types at the root level and contains their respective data. |
| sort |  ``` Optional ```  | Controls the sort order in which the response is returned. Uses the syntax: sort={field}+(asc|desc). |
| start |  ``` Optional ```  | Starting point for partial responses, for folder requests. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |
| filter |  ``` Optional ```  | Set to 'file' or 'folder', to include only those types of items in the response. |
| deep |  ``` Optional ```  ``` DefaultValue ```  | Specifies whether the search should stop at the topmost deleted item in the tree (deep=false), or navigate into it and list all the deleted contents    (deep=true). |


#### Example Usage

```java
String virtualfolder = "virtualfolder";
String sort = "sort";
Integer start = 153;
Integer count = 153;
String filter = "filter";
Boolean deep = false;
// Invoking the API call with sample inputs
filesFolders.retrieveTrashAsync(virtualfolder, sort, start, count, filter, deep, new APICallBack<TrashResponse>() {
    public void onSuccess(HttpContext context, TrashResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_search_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getSearchAsync") getSearchAsync

> Search for files and folders.


```java
void getSearchAsync(
        final String query,
        final String virtualfolder,
        final String sort,
        final Integer start,
        final Integer count,
        final APICallBack<SearchresultResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| query |  ``` Required ```  | Contains the text to be searched and supports a number of query fields that allow clients to restrict the search to particular parts of a file's or folder's metadata |
| virtualfolder |  ``` Optional ```  | Folder that represents various client types at the root level and contains their respective data. |
| sort |  ``` Optional ```  | Specify sort order for response. Syntax is :'{field}+{asc|desc}'.  Valid values for 'field' are: name, versionCreated, size, extension, album, artist, captureDate, compilation, contentType, creationDate, favorite, genre, height, modificationDate, priority, source, tags, title, timelineDate |
| start |  ``` Optional ```  | Page number to return, for paginated responses. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |


#### Example Usage

```java
String query = "query";
String virtualfolder = "virtualfolder";
String sort = "sort";
Integer start = 153;
Integer count = 153;
// Invoking the API call with sample inputs
filesFolders.getSearchAsync(query, virtualfolder, sort, start, count, new APICallBack<SearchresultResponse>() {
    public void onSuccess(HttpContext context, SearchresultResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_thumbnails_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getThumbnailsAsync") getThumbnailsAsync

> Retrieve thumbnails for a file.


```java
void getThumbnailsAsync(
        final String contentToken,
        final String size,
        final int th,
        final int tw,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentToken |  ``` Required ```  | The file's content token (obtained from a call to /metadata or /fullview). |
| size |  ``` Required ```  | Thumbnail size: 'xs' (24x24), 's' (64x64), or 'm' (128x128). Either 'size' or 'th' and 'tw' are required. |
| th |  ``` Required ```  | Thumbnail height (in pixels). Either 'size' or 'th' and 'tw' are required. |
| tw |  ``` Required ```  | Thumbnail width (in pixels). Either 'size' or 'th' and 'tw' are required. |


#### Example Usage

```java
String contentToken = "content-token";
String size = "size";
int th = 153;
int tw = 153;
// Invoking the API call with sample inputs
filesFolders.getThumbnailsAsync(contentToken, size, th, tw, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 415 | [Unsupported Media Type] Thumbnails are not supported for this type of file. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_metadata_path_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getMetadataPathAsync") getMetadataPathAsync

> Get metadata for a file or folder in a user's repository.


```java
void getMetadataPathAsync(
        final String path,
        final Boolean includeDeleted,
        final String sort,
        final Integer start,
        final Integer count,
        final String filter,
        final APICallBack<MetadataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | The path to the file or folder. |
| includeDeleted |  ``` Optional ```  ``` DefaultValue ```  | if true, response will include deleted files and folders. Default is false. |
| sort |  ``` Optional ```  | Specify sort order for response. Syntax is :'{field}+{asc|desc}'.  Valid values for 'field' are: name, versionCreated, size, extension, album, artist, captureDate, compilation, contentType, creationDate, favorite, genre, height, modificationDate, priority, source, tags, title, timelineDate |
| start |  ``` Optional ```  | Starting point for partial responses, for folder requests. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |
| filter |  ``` Optional ```  | Set to 'file' or 'folder', to include only those types of items in the response. |


#### Example Usage

```java
String path = "path";
Boolean includeDeleted = false;
String sort = "sort";
Integer start = 153;
Integer count = 153;
String filter = "filter";
// Invoking the API call with sample inputs
filesFolders.getMetadataPathAsync(path, includeDeleted, sort, start, count, filter, new APICallBack<MetadataResponse>() {
    public void onSuccess(HttpContext context, MetadataResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 410 | [Gone] File was removed. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="delete_purge_trash_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.deletePurgeTrashAsync") deletePurgeTrashAsync

> Purges all the files and folder from a repository.


```java
void deletePurgeTrashAsync(
        final String virtualfolder,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| virtualfolder |  ``` Required ```  | Folder that represents various client types at the root level and contains their respective data. |


#### Example Usage

```java
String virtualfolder = "virtualfolder";
// Invoking the API call with sample inputs
filesFolders.deletePurgeTrashAsync(virtualfolder, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_metadata_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getMetadataAsync") getMetadataAsync

> Get metadata for the root folder contents.


```java
void getMetadataAsync(
        final Boolean includeDeleted,
        final String sort,
        final Integer start,
        final Integer count,
        final String filter,
        final APICallBack<MetadataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| includeDeleted |  ``` Optional ```  ``` DefaultValue ```  | if true, response will include deleted files and folders. Default is false. |
| sort |  ``` Optional ```  | Specify sort order for response. Syntax is :'{field}+{asc|desc}'.  Valid values for 'field' are: name, versionCreated, size, extension, album, artist, captureDate, compilation, contentType, creationDate, favorite, genre, height, modificationDate, priority, source, tags, title, timelineDate |
| start |  ``` Optional ```  | Starting point for partial responses, for folder requests. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |
| filter |  ``` Optional ```  | Set to 'file' or 'folder', to include only those types of items in the response. |


#### Example Usage

```java
Boolean includeDeleted = false;
String sort = "sort";
Integer start = 153;
Integer count = 153;
String filter = "filter";
// Invoking the API call with sample inputs
filesFolders.getMetadataAsync(includeDeleted, sort, start, count, filter, new APICallBack<MetadataResponse>() {
    public void onSuccess(HttpContext context, MetadataResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] File was not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_upload_file_intent_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.FilesFoldersController.getUploadFileIntentAsync") getUploadFileIntentAsync

> Initiates a file upload intent request.


```java
void getUploadFileIntentAsync(
        final String path,
        final String name,
        final int size,
        final String checksum,
        final Boolean chunk,
        final APICallBack<Uploadurls> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | The path to the folder where file has to be uploaded. |
| name |  ``` Required ```  | Name of the file to be uploaded. |
| size |  ``` Required ```  | Size of the file to be uploaded. |
| checksum |  ``` Required ```  | Checksum of the file/chunk. |
| chunk |  ``` Optional ```  ``` DefaultValue ```  | Should be set to false, in case the file binary has to be uploaded with single request. Otherwise should be set to true when file binary has to be uploaded in multiple request. |


#### Example Usage

```java
String path = "path";
String name = "name";
int size = 153;
String checksum = "checksum";
Boolean chunk = false;
// Invoking the API call with sample inputs
filesFolders.getUploadFileIntentAsync(path, name, size, checksum, chunk, new APICallBack<Uploadurls>() {
    public void onSuccess(HttpContext context, Uploadurls response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 413 | [Request Too Long] User quota exceeded. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)

### <a name="playlists_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.PlaylistsController") PlaylistsController

#### Get singleton instance

The singleton instance of the ``` PlaylistsController ``` class can be accessed from the API Client.

```java
PlaylistsController playlists = client.getPlaylists();
```

#### <a name="delete_playlist_item_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.deletePlaylistItemAsync") deletePlaylistItemAsync

> Remove an item from a playlist.


```java
void deletePlaylistItemAsync(
        final String playlistUid,
        final String itemUid,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| itemUid |  ``` Required ```  | Unique id related to a specific item in a playlist. |


#### Example Usage

```java
String playlistUid = "playlistUid";
String itemUid = "itemUid";
// Invoking the API call with sample inputs
playlists.deletePlaylistItemAsync(playlistUid, itemUid, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_playlist_content_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.getPlaylistContentAsync") getPlaylistContentAsync

> Retrieves playlist content.


```java
void getPlaylistContentAsync(
        final String playlistUid,
        final String itemUid,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| itemUid |  ``` Required ```  | Unique id related to a specific item in a playlist. |


#### Example Usage

```java
String playlistUid = "playlistUid";
String itemUid = "itemUid";
// Invoking the API call with sample inputs
playlists.getPlaylistContentAsync(playlistUid, itemUid, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="delete_playlist_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.deletePlaylistAsync") deletePlaylistAsync

> Delete a playlist.


```java
void deletePlaylistAsync(
        final String playlistUid,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |


#### Example Usage

```java
String playlistUid = "playlistUid";
// Invoking the API call with sample inputs
playlists.deletePlaylistAsync(playlistUid, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="put_playlists_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.putPlaylistsAsync") putPlaylistsAsync

> Update a playlist.


```java
void putPlaylistsAsync(
        final String playlistUid,
        final PlaylistBase playlistBase,
        final APICallBack<Playlist> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| playlistBase |  ``` Required ```  | Request object to update basic playlist details. |


#### Example Usage

```java
try {
    String playlistUid = "playlistUid";
    PlaylistBase playlistBase = new PlaylistBase();
    // Invoking the API call with sample inputs
    playlists.putPlaylistsAsync(playlistUid, playlistBase, new APICallBack<Playlist>() {
        public void onSuccess(HttpContext context, Playlist response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_playlist_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.getPlaylistAsync") getPlaylistAsync

> Get a playlist definition.


```java
void getPlaylistAsync(
        final String playlistUid,
        final APICallBack<Playlist> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |


#### Example Usage

```java
String playlistUid = "playlistUid";
// Invoking the API call with sample inputs
playlists.getPlaylistAsync(playlistUid, new APICallBack<Playlist>() {
    public void onSuccess(HttpContext context, Playlist response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_playlist_item_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.postPlaylistItemAsync") postPlaylistItemAsync

> Add item(s) to a playlist.


```java
void postPlaylistItemAsync(
        final String playlistUid,
        final PlaylistAddRequest playlistItems,
        final APICallBack<PlaylistAddResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| playlistItems |  ``` Required ```  | Request object to add items in playlist. |


#### Example Usage

```java
try {
    String playlistUid = "playlistUid";
    PlaylistAddRequest playlistItems = new PlaylistAddRequest();
    // Invoking the API call with sample inputs
    playlists.postPlaylistItemAsync(playlistUid, playlistItems, new APICallBack<PlaylistAddResponse>() {
        public void onSuccess(HttpContext context, PlaylistAddResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="update_playlist_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.updatePlaylistAsync") updatePlaylistAsync

> Update a playlist by sending a new 'playlistDefinition' model.


```java
void updatePlaylistAsync(
        final String playlistUid,
        final PlaylistRequest playlist,
        final APICallBack<Playlist> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| playlist |  ``` Required ```  | playlist request object |


#### Example Usage

```java
try {
    String playlistUid = "playlistUid";
    PlaylistRequest playlist = new PlaylistRequest();
    // Invoking the API call with sample inputs
    playlists.updatePlaylistAsync(playlistUid, playlist, new APICallBack<Playlist>() {
        public void onSuccess(HttpContext context, Playlist response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="post_playlist_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.postPlaylistAsync") postPlaylistAsync

> Create a playlist.


```java
void postPlaylistAsync(
        final PlaylistRequest playlist,
        final APICallBack<Playlist> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlist |  ``` Required ```  | playlist request object |


#### Example Usage

```java
try {
    PlaylistRequest playlist = new PlaylistRequest();
    // Invoking the API call with sample inputs
    playlists.postPlaylistAsync(playlist, new APICallBack<Playlist>() {
        public void onSuccess(HttpContext context, Playlist response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_playlist_items_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.getPlaylistItemsAsync") getPlaylistItemsAsync

> Get a list of a playlists's items.


```java
void getPlaylistItemsAsync(
        final String playlistUid,
        final Integer start,
        final Integer count,
        final String sort,
        final APICallBack<List<PlaylistItem>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| playlistUid |  ``` Required ```  | Unique id related to a specific playlist. |
| start |  ``` Optional ```  | Starting point for partial responses, for folder requests. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |
| sort |  ``` Optional ```  | Specify sort order for response. Syntax is '{field}+{asc|desc}'.Valid values for 'field' are: name, versionCreated, size, extension, album, artist, captureDate, contentType, creationDate, genre, height, priority, title, timelineDate. |


#### Example Usage

```java
String playlistUid = "playlistUid";
Integer start = 153;
Integer count = 153;
String sort = "sort";
// Invoking the API call with sample inputs
playlists.getPlaylistItemsAsync(playlistUid, start, count, sort, new APICallBack<List<PlaylistItem>>() {
    public void onSuccess(HttpContext context, List<PlaylistItem> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="get_playlists_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.PlaylistsController.getPlaylistsAsync") getPlaylistsAsync

> Get a list of the user's playlists.


```java
void getPlaylistsAsync(
        final String type,
        final Integer start,
        final Integer count,
        final String sort,
        final APICallBack<List<Playlist>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Optional ```  | The type of the playlist. Can be one of 'image', 'music', 'video' or 'image-video'. |
| start |  ``` Optional ```  | Starting point for partial responses, for folder requests. Default is 1. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for folder requests.  Required if start is specified. |
| sort |  ``` Optional ```  | Specify sort order for response. Syntax is '{field}+{asc|desc}'. Valid values for 'field' are 'name' and 'creationDate'. |


#### Example Usage

```java
String type = "type";
Integer start = 153;
Integer count = 153;
String sort = "sort";
// Invoking the API call with sample inputs
playlists.getPlaylistsAsync(type, start, count, sort, new APICallBack<List<Playlist>>() {
    public void onSuccess(HttpContext context, List<Playlist> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Query parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)

### <a name="shares_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.verizon.cloudapi.api.controllers.SharesController") SharesController

#### Get singleton instance

The singleton instance of the ``` SharesController ``` class can be accessed from the API Client.

```java
SharesController shares = client.getShares();
```

#### <a name="delete_share_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.SharesController.deleteShareAsync") deleteShareAsync

> Delete a share.


```java
void deleteShareAsync(
        final String shareUid,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareUid |  ``` Required ```  | The unique ID of the share. |


#### Example Usage

```java
String shareUid = "shareUid";
// Invoking the API call with sample inputs
shares.deleteShareAsync(shareUid, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 404 | [Not Found] Resource not found. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="create_share_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.SharesController.createShareAsync") createShareAsync

> Create Share.


```java
void createShareAsync(
        final CreateShareRequest createShare,
        final APICallBack<CreateShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| createShare |  ``` Required ```  | Allows a user to create a share |


#### Example Usage

```java
try {
    CreateShareRequest createShare = new CreateShareRequest();
    // Invoking the API call with sample inputs
    shares.createShareAsync(createShare, new APICallBack<CreateShareResponse>() {
        public void onSuccess(HttpContext context, CreateShareResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or invalid. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



#### <a name="list_shares_async"></a>![Method: ](http://apidocs.io/img/method.png "com.verizon.cloudapi.api.controllers.SharesController.listSharesAsync") listSharesAsync

> List Shares.


```java
void listSharesAsync(
        final String cursor,
        final String filter,
        final String since,
        final String until,
        final Integer count,
        final APICallBack<ShareResponseList> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cursor |  ``` Optional ```  | A cursor used in paginating the response. Cursors are returned in 'next' and 'prev' links in the response body. |
| filter |  ``` Optional ```  ``` DefaultValue ```  | Filters the returned shares. Currently the value can only be 'outbound' (shared by the user). |
| since |  ``` Optional ```  | The date and time, expressed in the W3C date and time format, after which messages should be returned. |
| until |  ``` Optional ```  | The date and time, expressed in the W3C date and time format, up to which messages should be returned. |
| count |  ``` Optional ```  | Maximum items to include in a paginated response, for share requests. |


#### Example Usage

```java
String cursor = "cursor";
String filter = "outbound";
String since = "since";
String until = "until";
Integer count = 153;
// Invoking the API call with sample inputs
shares.listSharesAsync(cursor, filter, since, until, count, new APICallBack<ShareResponseList>() {
    public void onSuccess(HttpContext context, ShareResponseList response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | [Bad Request] Parameters missing or any invalid parameter passed. |
| 401 | [Unauthorized] Bearer token is missing, expired, or invalid. |
| 503 | [Service Unavailable] See response body for more detail. |



[Back to List of Controllers](#list_of_controllers)



