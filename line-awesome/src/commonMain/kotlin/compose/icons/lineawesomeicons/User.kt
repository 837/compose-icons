package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1445f, 5.0f, 9.0f, 8.1445f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4102f, 10.2305f, 16.5508f, 12.0938f, 17.8125f)
                curveTo(8.5273f, 19.3438f, 6.0f, 22.8828f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.5703f, 11.5703f, 19.0f, 16.0f, 19.0f)
                curveTo(20.4297f, 19.0f, 24.0f, 22.5703f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.8828f, 23.4727f, 19.3438f, 19.9063f, 17.8125f)
                curveTo(21.7695f, 16.5508f, 23.0f, 14.4102f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1445f, 19.8555f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.7734f, 7.0f, 21.0f, 9.2266f, 21.0f, 12.0f)
                curveTo(21.0f, 14.7734f, 18.7734f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2266f, 17.0f, 11.0f, 14.7734f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2266f, 13.2266f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
