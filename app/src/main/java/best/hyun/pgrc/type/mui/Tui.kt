package best.hyun.pgrc.type.mui

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Tui : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_tui)
    override val type: PET_TYPE
        get() = PET_TYPE.MUI
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_tui)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WATER
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 57
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 9
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1565
    override val maxLvMaxAtk: Int
        get() = 341
    override val maxLvMaxDef: Int
        get() = 255
    override val maxLvMaxSpd: Int
        get() = 127
    override val initLvMinHp: Int
        get() = 45
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 7
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1356
    override val maxLvMinAtk: Int
        get() = 303
    override val maxLvMinDef: Int
        get() = 216
    override val maxLvMinSpd: Int
        get() = 96
    override val minAllGrowth: Double
        get() = 4.318
    override val maxAllGrowth: Double
        get() = 5.025
}