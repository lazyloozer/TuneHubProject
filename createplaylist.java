<!-- <!DOCTYPE html>
<html  "https://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addplaylist" method="post">
<label>PlayList Name:</label>
<input type="text" name="name">

<div th:each="song:${songs}">
<input type="checkbox" th:name="songs" th:value="${song.id}">
<label th:text="${song.name}"></label>
</div>
<input type="submit" value="ADD PLAYLIST" >
</form>

</body>
</html> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Playlist Form</title>
    <link rel="stylesheet" type="text/css" href="createplaylist.css" />
  </head>
  <body>
    <form action="addplaylist" method="post">
      <label>PlayList Name:</label>
      <input type="text" name="name" id="name" />

      <div th:each="song:${songs}">
        <input type="checkbox" th:name="songs" th:value="${song.id}" />
        <label th:text="${song.name}"></label>
      </div>

      <input type="submit" value="ADD PLAYLIST" />
    </form>
  </body>
</html>
