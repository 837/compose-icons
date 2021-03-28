package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.BatteryFull: ImageVector
    get() {
        if (_batteryFull != null) {
            return _batteryFull!!
        }
        _batteryFull = Builder(name = "BatteryFull", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                curveTo(5.4477f, 15.0f, 5.0f, 14.5523f, 5.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 9.4477f, 5.4477f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 9.0f, 18.0f, 9.4477f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 14.5523f, 17.5523f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3431f, 6.0f, 2.0f, 7.3432f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.6569f, 3.3431f, 18.0f, 5.0f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 18.0f, 21.0f, 16.6569f, 21.0f, 15.0f)
                curveTo(21.5523f, 15.0f, 22.0f, 14.5523f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 9.4477f, 21.5523f, 9.0f, 21.0f, 9.0f)
                curveTo(21.0f, 7.3432f, 19.6569f, 6.0f, 18.0f, 6.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 8.0f, 4.0f, 8.4477f, 4.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 15.5523f, 4.4477f, 16.0f, 5.0f, 16.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 16.0f, 19.0f, 15.5523f, 19.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 8.4477f, 18.5523f, 8.0f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _batteryFull!!
    }

private var _batteryFull: ImageVector? = null
