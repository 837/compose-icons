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

public val LineAwesomeIcons.CalculatorSolid: ImageVector
    get() {
        if (_calculatorSolid != null) {
            return _calculatorSolid!!
        }
        _calculatorSolid = Builder(name = "CalculatorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(10.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(12.0f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(15.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(19.0f, 15.0f)
                lineTo(19.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(11.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 19.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(19.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 19.0f)
                close()
                moveTo(11.0f, 23.0f)
                lineTo(11.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 23.0f)
                close()
                moveTo(15.0f, 23.0f)
                lineTo(15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                lineTo(17.0f, 23.0f)
                close()
                moveTo(19.0f, 23.0f)
                lineTo(19.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(21.0f, 23.0f)
                close()
            }
        }
        .build()
        return _calculatorSolid!!
    }

private var _calculatorSolid: ImageVector? = null
