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

public val LineAwesomeIcons.Kiss: ImageVector
    get() {
        if (_kiss != null) {
            return _kiss!!
        }
        _kiss = Builder(name = "Kiss", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 12.0f)
                close()
                moveTo(15.0f, 17.0078f)
                lineTo(15.0f, 18.498f)
                curveTo(15.901f, 18.498f, 16.4766f, 18.9129f, 16.4766f, 19.1289f)
                curveTo(16.4766f, 19.344f, 15.9045f, 19.7545f, 15.0098f, 19.7578f)
                curveTo(15.0064f, 19.7578f, 15.0033f, 19.7578f, 15.0f, 19.7578f)
                lineTo(15.0f, 19.7598f)
                lineTo(15.0f, 21.248f)
                lineTo(15.0f, 21.25f)
                curveTo(15.0033f, 21.25f, 15.0064f, 21.25f, 15.0098f, 21.25f)
                curveTo(15.9045f, 21.2533f, 16.4766f, 21.6638f, 16.4766f, 21.8789f)
                curveTo(16.4766f, 22.0949f, 15.901f, 22.5098f, 15.0f, 22.5098f)
                lineTo(15.0f, 24.0f)
                curveTo(16.669f, 24.0f, 17.9766f, 23.0679f, 17.9766f, 21.8789f)
                curveTo(17.9766f, 21.3464f, 17.7031f, 20.8727f, 17.2637f, 20.5039f)
                curveTo(17.7031f, 20.1351f, 17.9766f, 19.6614f, 17.9766f, 19.1289f)
                curveTo(17.9766f, 17.9399f, 16.669f, 17.0078f, 15.0f, 17.0078f)
                close()
            }
        }
        .build()
        return _kiss!!
    }

private var _kiss: ImageVector? = null
