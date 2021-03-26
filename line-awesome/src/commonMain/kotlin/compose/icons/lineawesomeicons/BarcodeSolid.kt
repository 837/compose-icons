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

public val LineAwesomeIcons.BarcodeSolid: ImageVector
    get() {
        if (_barcodeSolid != null) {
            return _barcodeSolid!!
        }
        _barcodeSolid = Builder(name = "BarcodeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(6.0f, 25.0f)
                lineTo(12.0f, 25.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 25.0f)
                lineTo(16.0f, 25.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(18.0f, 7.0f)
                lineTo(18.0f, 25.0f)
                lineTo(22.0f, 25.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(24.0f, 7.0f)
                lineTo(24.0f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 7.0f)
                close()
                moveTo(28.0f, 7.0f)
                lineTo(28.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                close()
            }
        }
        .build()
        return _barcodeSolid!!
    }

private var _barcodeSolid: ImageVector? = null
