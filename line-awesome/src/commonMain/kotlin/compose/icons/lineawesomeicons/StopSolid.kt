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

public val LineAwesomeIcons.StopSolid: ImageVector
    get() {
        if (_stopSolid != null) {
            return _stopSolid!!
        }
        _stopSolid = Builder(name = "StopSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                lineTo(6.0f, 26.0f)
                lineTo(26.0f, 26.0f)
                lineTo(26.0f, 6.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                close()
            }
        }
        .build()
        return _stopSolid!!
    }

private var _stopSolid: ImageVector? = null
