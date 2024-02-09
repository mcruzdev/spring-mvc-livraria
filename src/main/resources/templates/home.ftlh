<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Livraria f1rst</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="w-screen h-screen">
  <div class="flex flex-col w-full h-full bg-gray-600">

    <nav class="flex-none h-12 flex p-4 bg-black items-center">
      <p class="font-medium text-white">f<span class="text-red-500">1</span>r<span class="text-red-500">st</span>
    </p>
  </nav>

  <main class="flex flex-1 flex-col items-center justify-center">
    <#if logged!false>
        <h1 class="text-thin text-white">Welcome!</h1>
    <#else>
        <div class="flex flex-col items-center justify-center p-4 rounded-lg shadow-lg shadow-gray-700">
          <form action="/login" method="POST" class="flex flex-col gap-2 p-2 h-full w-full items-center justify-center">
            <input name="email" class="bg-gray-800 rounded-sm p-2 text-white text-center focus:outline-none focus-visible:outline-none" type="text" placeholder="E-mail" />
            <input name="password" class="bg-gray-800 rounded-sm p-2 text-white text-center border-gray-800 focus:outline-none focus-visible:outline-none" type="password" placeholder="Password" />
            <button class="bg-red-600 rounded-sm p-2 text-white text-center w-full hover:bg-red-700" type="submit">Entrar</button>
          </form>
      </#if>
    </div>
  </main>
</div>
</body>

</html>