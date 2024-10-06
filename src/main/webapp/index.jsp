<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD Application</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f4f4f4;
            color: #333;
            padding: 20px;
        }

        header {
            background: #35424a;
            color: #ffffff;
            padding: 20px;
            text-align: center;
        }

        nav ul {
            list-style: none;
        }

        nav ul li {
            display: inline;
            margin: 0 15px;
        }

        nav ul li a {
            color: #ffffff;
            text-decoration: none;
        }

        main {
            margin-top: 20px;
        }

        section {
            margin-bottom: 20px;
            background: #ffffff;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        footer {
            text-align: center;
            padding: 10px 0;
            background: #35424a;
            color: #ffffff;
            position: relative;
            bottom: 0;
            width: 100%;
        }

        .item-list {
            margin-top: 10px;
        }

        .item {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 10px;
        }

        .button {
            background: #35424a;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .button:hover {
            background: #2c3e50;
        }
    </style>
</head>
<body>
    <header>
        <h1>CRUD Application</h1>
        <nav>
            <ul>
                <li><a href="home">Home</a></li>
                <li><a href="add">Add Item</a></li>
                <li><a href="list">Item List</a></li>
            </ul>
        </nav>
    </header>

    <main>
        <section id="add">
            <h2>Add New Item</h2>
            <form action="helloHttp" method="POST">
                <input type="text" name="name" placeholder="Enter item name" required>
                <button type="submit" class="button">Post</button>
            </form>
<br>
            <form action="sessoin1" method="Get">
                <input type="text" name="name" placeholder="Enter item name" required>
                <button type="submit" class="button">Get</button>
            </form>
        </section>

        <section id="list">
            <h2>Item List</h2>
            <div class="item-list" id="itemList">
                <!-- Items will be dynamically added here -->
            </div>
        </section>
    </main>

    <footer>
        <p>&copy; 2024 CRUD Application. All rights reserved.</p>
    </footer>

   </body>
</html>
