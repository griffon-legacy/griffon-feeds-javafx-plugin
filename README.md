
Zeusboxstudio's RSS icon set
----------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/feeds-javafx](http://artifacts.griffon-framework.org/plugin/feeds-javafx)


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

