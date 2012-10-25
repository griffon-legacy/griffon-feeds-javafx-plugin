/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class FeedsJavafxGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.1.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [javafx: '0.8']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['javafx']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-feeds-javafx-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Zeusboxstudio's RSS icon set"
    String description = '''
Provides a shortcut for adding icons based on Zeusboxstudio's [RSS icon library][1].
It also bundle's the [Rome library][2] for consuming/producing RSS/Atom feeds

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*       | *Node*                        | *Property* | *Type* | *Default*   | *Bindable* |
| ------------ | ----------------------------- | ---------- | ------ | ----------- | ---------- |
| feedIcon     | `javax.scene.image.Image`     | icon       | String |             | no         |
|              |                               | size       | int    | `16`        | no         |
| feedIconView | `javax.scene.image.ImageView` | icon       | String |             | no         |
|              |                               | size       | int    | `16`        | no         |

Valid values for `icon` can be obtained by running **feed-icon-selector** and inspecting the tooltip of the chosen icon.

Valid values for `size` property are: 16, 22.

Scripts
-------

 * **feed-icon-selector** - launches a window that displays all available icons (Hover an icon to see the icon name)

[1]: http://www.zeusboxstudio.com/
[2]: https://rome.dev.java.net/
'''
}
