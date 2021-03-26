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

public val LineAwesomeIcons.FolderSolid: ImageVector
    get() {
        if (_folderSolid != null) {
            return _folderSolid!!
        }
        _folderSolid = Builder(name = "FolderSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 15.4375f)
                lineTo(27.7188f, 13.7188f)
                lineTo(28.0f, 13.4063f)
                lineTo(28.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(22.0f, 5.0f)
                lineTo(22.0f, 13.4063f)
                lineTo(22.2813f, 13.7188f)
                lineTo(24.0f, 15.4375f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(26.0f, 5.0f)
                lineTo(26.0f, 12.5625f)
                lineTo(25.0f, 13.5625f)
                lineTo(24.0f, 12.5625f)
                close()
            }
        }
        .build()
        return _folderSolid!!
    }

private var _folderSolid: ImageVector? = null
