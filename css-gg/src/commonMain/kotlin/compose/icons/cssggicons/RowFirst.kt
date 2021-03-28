package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.RowFirst: ImageVector
    get() {
        if (_rowFirst != null) {
            return _rowFirst!!
        }
        _rowFirst = Builder(name = "RowFirst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                curveTo(5.4477f, 11.0f, 5.0f, 11.4477f, 5.0f, 12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 13.0f, 15.0f, 12.5523f, 15.0f, 12.0f)
                curveTo(15.0f, 11.4477f, 14.5523f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 15.0f)
                curveTo(5.4477f, 15.0f, 5.0f, 15.4477f, 5.0f, 16.0f)
                curveTo(5.0f, 16.5523f, 5.4477f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 17.0f, 15.0f, 16.5523f, 15.0f, 16.0f)
                curveTo(15.0f, 15.4477f, 14.5523f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(5.0f, 7.4477f, 5.4477f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 7.0f, 19.0f, 7.4477f, 19.0f, 8.0f)
                curveTo(19.0f, 8.5523f, 18.5523f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 9.0f, 5.0f, 8.5523f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _rowFirst!!
    }

private var _rowFirst: ImageVector? = null
