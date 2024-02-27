<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="viewplaylists" method="post">
<div th:each="playlist:${playlists}">
<h2 th:name="playlists" th:value="${playlist.id}"></h2>
 <p th:text="${playlist.name}"></p> 
<p th:text="${playlist.songs}"></p> 
<ul>
<li th:each="playlist:${playlist.songs}">
<span th:text="${playlist.name}"> </span>
<audio controls>
<source th:src="${playlist.link}">
</audio>
 </li>
</ul> 

</div>
</form>
</body>
</html>

 -->
 <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Playlist</title>
    <link rel="stylesheet" type="text/css" href="viewplaylistsongs.css">
</head>
<body>
<h1>WELCOME TO UR PLAYLIST ENJOY UR MUSIC!!!</h1>
<form action="viewplaylists" method="post">
    <div id="title" th:each="playlist:${playlists}" class="playlist-container">
        <h2 th:name="playlists" th:value="${playlist.id}"></h2>
        <p th:text="${playlist.name}"></p>
        <ul>
            <li th:each="song:${playlist.songs}" class="song-item">
                <span id="list" th:text="${song.name}"></span>
                <audio controls>
                    <source th:src="${song.link}">
                </audio>
            </li>
        </ul>
    </div>
</form>

</body>
</html>
 
