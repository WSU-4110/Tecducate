<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Settings Page</title>
    <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/settingStyle.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> <!-- Font Awesome CSS -->
</head>
<body>
    <header>
        <h1>Settings</h1>
    </header>

    <section id="user-settings">
        <h2>Edit User Information</h2>
        
        <form action = "delete" method ="post">
        
       
        <div class="button-container">
        
        
            <button id="update-profile-button"><i class="fas fa-user-edit"></i> Update Profile</button>
            <button id="delete-profile-button" type = "submit"><i class="fas fa-user-times"></i> Delete Profile</button>
            <button id="reset-lesson-plan-button"><i class="fas fa-undo"></i> Reset Lesson Plan</button>
        </div>
        <script>

</script>
        </form>
    </section>

    <div class="button-group">
        <button id="back-to-profile-button"><i class="fas fa-arrow-left"></i> Back to Profile</button>
    </div>

    <footer>
        <p>&copy; 2023 Tecducate</p>
    </footer>
    <script>
        document.getElementById("back-to-profile-button").addEventListener("click", function () {
            window.location.href = "profile";
        });

        document.getElementById("update-profile-button").addEventListener("click", function () {
            window.location.href = "updateProfileView.jsp";
        })
        
    </script>

</body>
</html>

