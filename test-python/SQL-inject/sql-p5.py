from django.db.models import Q
from myapp.models import User

def search_user(field, value):
    # 动态字段注入
    users = User.objects.filter(Q(**{field: value}))
    return users
