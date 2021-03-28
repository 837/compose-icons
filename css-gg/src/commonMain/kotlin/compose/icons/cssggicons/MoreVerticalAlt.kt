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

public val CssGgIcons.MoreVerticalAlt: ImageVector
    get() {
        if (_moreVerticalAlt != null) {
            return _moreVerticalAlt!!
        }
        _moreVerticalAlt = Builder(name = "MoreVerticalAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                curveTo(14.0f, 7.1046f, 13.1046f, 8.0f, 12.0f, 8.0f)
                curveTo(10.8954f, 8.0f, 10.0f, 7.1046f, 10.0f, 6.0f)
                curveTo(10.0f, 4.8954f, 10.8954f, 4.0f, 12.0f, 4.0f)
                curveTo(13.1046f, 4.0f, 14.0f, 4.8954f, 14.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                curveTo(14.0f, 19.1046f, 13.1046f, 20.0f, 12.0f, 20.0f)
                curveTo(10.8954f, 20.0f, 10.0f, 19.1046f, 10.0f, 18.0f)
                curveTo(10.0f, 16.8954f, 10.8954f, 16.0f, 12.0f, 16.0f)
                curveTo(13.1046f, 16.0f, 14.0f, 16.8954f, 14.0f, 18.0f)
                close()
            }
        }
        .build()
        return _moreVerticalAlt!!
    }

private var _moreVerticalAlt: ImageVector? = null
