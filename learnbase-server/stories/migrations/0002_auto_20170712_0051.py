# -*- coding: utf-8 -*-
# Generated by Django 1.9.6 on 2017-07-12 00:51
from __future__ import unicode_literals

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('stories', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='reader',
            name='reading',
        ),
        migrations.RemoveField(
            model_name='story',
            name='first_page',
        ),
        migrations.RemoveField(
            model_name='storypage',
            name='path_1',
        ),
        migrations.RemoveField(
            model_name='storypage',
            name='path_2',
        ),
        migrations.RemoveField(
            model_name='storypage',
            name='story',
        ),
        migrations.DeleteModel(
            name='Reader',
        ),
        migrations.DeleteModel(
            name='Story',
        ),
        migrations.DeleteModel(
            name='StoryPage',
        ),
    ]
