from myapp.models import User

def get_user():
    return User.objects.get(username="admin")
