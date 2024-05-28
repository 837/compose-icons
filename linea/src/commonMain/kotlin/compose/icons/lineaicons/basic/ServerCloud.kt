package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.ServerCloud: ImageVector
    get() {
        if (_serverCloud != null) {
            return _serverCloud!!
        }
        _serverCloud = Builder(name = "ServerCloud", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 41.0f)
                lineToRelative(6.0f, -40.0f)
                lineToRelative(42.0f, 0.0f)
                lineToRelative(6.0f, 40.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 41.0f)
                horizontalLineToRelative(54.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(-54.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 52.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.887f, 27.0f)
                horizontalLineTo(39.0f)
                curveToRelative(1.887f, 0.0f, 3.0f, -1.0f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.0f, -1.0f, -3.0f, -3.0f, -3.0f)
                curveToRelative(0.0f, -3.604f, -3.277f, -6.0f, -7.0f, -6.0f)
                curveToRelative(-3.295f, 0.0f, -6.413f, 2.978f, -7.0f, 6.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-2.0f, 0.0f, -3.0f, 2.0f, -3.0f, 3.0f)
                curveToRelative(0.0f, 2.0f, 1.0f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.434f)
            }
        }
        .build()
        return _serverCloud!!
    }

private var _serverCloud: ImageVector? = null
